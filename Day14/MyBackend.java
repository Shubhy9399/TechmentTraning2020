

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyBackend
 */
@WebServlet("/myformbackend")
public class MyBackend extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyBackend() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("hello you have called server");
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();//we have to get response
		out.print("hello this is form server ");
		String name =request.getParameter("name");
		int age =Integer.parseInt(request.getParameter("age"));
		
		out.print("your name is "+ name +"<br>");
		out.print("your age is "+ age +"<br>");
		
		if(age>18) {
			out.print("you can vote");
		}
		else {
			out.print("you cannot vote");
		}
		
		Cookie cookie = new Cookie("mykey1",name);
		response.addCookie(cookie);
		
		out.print("<a href='second'>go to second page</a> <br>");
		
		
	}

}
