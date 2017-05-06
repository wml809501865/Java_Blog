package mine;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/QuitServlet")  
public class QuitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		response.setCharacterEncoding("UTF-8");
	
		PrintWriter out = response.getWriter();
	
		request.setCharacterEncoding("UTF-8");
				
		session.setAttribute("loggedIn", "no");
		
		if(session.getAttribute("loggedIn").equals("no"))
		{
			out.println("<script>");
			out.println("alert('退出成功!');");
			out.println("history.back();");
			out.println("</script>");
		}
		
		out.flush();
		out.close();
	}

}
