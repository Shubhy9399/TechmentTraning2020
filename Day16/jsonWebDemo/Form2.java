

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


@WebServlet("/myjavafile2")
public class Form2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 Gson gson=new Gson();
	 
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		Student stud = new Student();
		stud.setName(request.getParameter("name"));
		
		String studjsonstring = gson.toJson(stud);
		PrintWriter out = response.getWriter();
		//response.setContentType("text/html");
	    response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		out.print(studjsonstring);
		
	}

}
