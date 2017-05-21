package mine;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/WriteServlet")
public class WriteServlet extends HttpServlet {
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
		String log=(String) session.getAttribute("loggedIn");
		if("yes"==log)
		{}
		else{
			out.println("<script>");
			out.println("alert('娌℃湁鐧诲叆鍟�');");
			out.println("history.back();");
			out.println("</script>");
		}
		SimpleDateFormat datee =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = datee.format(new Date());
		String getusername = session.getAttribute("username").toString();
		String gettitle = request.getParameter("blogtitle");
		String getblogtext = request.getParameter("blogtext");
		String account =session.getAttribute("account").toString();
		String sql="Insert into post(username,title,text,date,account) values(";
		sql=sql+'\''+getusername+'\''+','+'\''+gettitle+'\''+','+'\''+getblogtext+'\''+','+'\''+date+'\''+','+'\''+account+'\''+')';
		int res =conndb.adduser(sql);

		conndb.close();
		if(res==0){
			try {
				throw new Exception("GG浜嗗憪 ");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			}
		if(session.getAttribute("loggedIn").equals("yes"))
		{
			out.println("<script>");
			out.println("alert('涓婁紶鎴愬姛');");
			out.println("history.back();");
			out.println("</script>");
		}
		out.flush();
		out.close();
	}

}
