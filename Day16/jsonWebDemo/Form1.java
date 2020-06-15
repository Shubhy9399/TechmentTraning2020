

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/myjavafile1")
public class Form1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

   Gson gson=new Gson();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName(request.getParameter("u"));
		
		String empjsonstring = gson.toJson(emp);
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
	   // response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		out.print(empjsonstring);
	}

}
