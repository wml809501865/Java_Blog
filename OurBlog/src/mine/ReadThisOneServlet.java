package mine;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ReadThisOneServlet")  
public class ReadThisOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		response.setCharacterEncoding("UTF-8");
	
		PrintWriter out = response.getWriter();
	
		request.setCharacterEncoding("UTF-8");
				
		ConnDB conndb=new ConnDB();
		ConnDB.getConnection();
		String getusername ="Tourist";
		String log=(String) session.getAttribute("loggedIn");
		if(null==log)
		{}
		else if(log.equals("yes"))
		 getusername = session.getAttribute("username").toString();
		String gettitle = "";
		String sql="select * from post";
		ResultSet res =conndb.executeQuery(sql);
		try {
			 gettitle = request.getParameter("blogtitle");
			while(res.next()){
				//System.out.println(getaccount);
				//System.out.println(getpassword);
				if(gettitle.equals(res.getString("title"))){
					
					String title =res.getString("title");
					request.setAttribute("title", title);
					String Blogusername=res.getString("username");
					request.setAttribute("blogusername", Blogusername);
					String text = res.getString("text");
					request.setAttribute("text",text);
					String time =res.getString("date");
					request.setAttribute("time", time);
					break;
					} 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conndb.close();
		List<REPLY> replylist = new ArrayList<REPLY>();
		// 获取数据库连接
		Connection conn = null;
		conn=ConnDB.getConnection();
		// 分页查询的SQL语句
		String sqll = "select * from reply order by date desc";
		try {
			// 获取PreparedStatement
			PreparedStatement ps = conn.prepareStatement(sqll);
			// 对SQL语句中的第1个参数赋值
			ResultSet rs = ps.executeQuery();
			// 光标向后移动，并判断是否有效
			String gettitlee =request.getAttribute("title").toString();
			while(rs.next()){
				// 实例化Product
				REPLY p = new REPLY();
				// 对name属性赋值
				if(rs.getString("title").equals(gettitlee)){
				p.setname(rs.getString("name"));
				p.setTitle(rs.getString("title"));
				p.setFloor(rs.getInt("floor"));
				p.setDate(rs.getString("date"));
				p.setReply(rs.getString("reply"));
				// 将Product添加到List集合中
				replylist.add(p);
				}
				}
			rs.close();
			// 关闭PreparedStatement
			ps.close();
			// 关闭Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("replylist", replylist);
		request.getRequestDispatcher("ReadText.jsp").forward(request, response);
		out.flush();
		out.close();
	}

}
