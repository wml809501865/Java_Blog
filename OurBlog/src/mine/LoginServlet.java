package mine;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String username;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		response.setCharacterEncoding("UTF-8");
	
		PrintWriter out = response.getWriter();
	
		request.setCharacterEncoding("UTF-8");
	
		boolean check =false;
			
		ConnDB conndb=new ConnDB();
		ConnDB.getConnection();
		
		String sql="select * from user";
		ResultSet res =conndb.executeQuery(sql);
		try {
			String getaccount = request.getParameter("account");
			String getpassword = request.getParameter("password");
			while(res.next()){
				//System.out.println(getaccount);
				//System.out.println(getpassword);
				if(getaccount.equals(res.getString("account"))&&getpassword.equals(res.getString("password"))){
					check =true;
					username=res.getString("username");
					break;
					} 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conndb.close();
		if(check==false)
		{
			out.println("<script>");
			out.println("alert('璐︽埛鎴栧瘑鐮侀敊璇�');");
			out.println("history.back();");
			out.println("</script>");
		}
		else
		{	
			String getaccount = request.getParameter("account");
			session.setAttribute("loggedIn", "yes");
			session.setAttribute("username", username);
			session.setAttribute("account", getaccount);
			//session.getAttribute("loggedIn").equals("yes")
			response.sendRedirect("usermain.jsp");
		}
		out.flush();
		out.close();
	}

}
