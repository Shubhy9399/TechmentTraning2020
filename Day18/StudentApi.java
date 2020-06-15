package com.techment;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/student")
public class StudentApi {
    @GET
	@Path("/studentdetails")
	 public String getStudentDetails()
	 {
		 return "hello this is student details";
	 }
    
    @GET
	@Path("/byname/{name}")
	 public String getStudentdetailsbyname(@PathParam("name") String name)
	 {
		 return "Your name is "+ name;
	 }
    
    @GET
    @Path("/getstudent")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getstudentdetails2() {
    	   
    	Student student = new Student();
    	student.setId(1);
    	student.setName("ravi");
    	student.setDept("hr");
    	
    	return student;
    }
}
