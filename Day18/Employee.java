package com.techment;
 
 import javax.ws.rs.GET;
 import javax.ws.rs.Path;
 
 @Path("/employee")
public class Employee {
     @GET
	 @Path("empdetails")
	 public String empdetails() {
		 return "employee details class";
	 }
}
