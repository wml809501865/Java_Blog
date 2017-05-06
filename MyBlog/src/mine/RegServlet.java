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

@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
	
		PrintWriter out = response.getWriter();
	
		request.setCharacterEncoding("UTF-8");
	
		String username = request.getParameter("Username");
		
		String name = request.getParameter("account");
		
		String password = request.getParameter("password");
		
		String qq = request.getParameter("qq");
		
		String mail = request.getParameter("mail");
		
		String personal = request.getParameter("personal");
		SimpleDateFormat datee =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = datee.format(new Date());
		
		ConnDB conndb=new ConnDB();
		ConnDB.getConnection();
		
		String sql="Insert into user(account,username,password,qq,mail,personal,time) values(";
		sql=sql+'\''+name+'\''+','+'\''+username+'\''+','+'\''+password+'\''+','+'\''+qq+'\''+','+'\''+mail+'\''+','+'\''+personal+'\''+','+'\''+date+'\''+')';
		int res =conndb.adduser(sql);
		conndb.close();
		if(res==0){
			try {
				throw new Exception("GG了呐 ");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			}
		else
		{
			out.println("<script>");
			out.println("alert('注册成功');");
			out.println("history.back();");
			out.println("</script>");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("login.jsp");    
		}
		
		out.flush();
		out.close();
	}

}
