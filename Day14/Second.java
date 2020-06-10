

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Second
 */
@WebServlet("/second")
public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/pdf");
		PrintWriter out=response.getWriter();
		
		out.print("this is second page");
		Cookie ck[] = request.getCookies();
		
		for(int i=0;i<ck.length;i++) {
			System.out.println(ck[i].getName()+" "+ck[i].getValue());
		}
	}

}
