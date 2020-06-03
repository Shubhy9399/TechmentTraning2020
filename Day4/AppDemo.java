package com.techment;

import java.io.IOException;

import org.apache.log4j.Category;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.HTMLLayout;

public class AppDemo {

	static Logger logger =Logger.getLogger("AppDemo.class");
	
	public static void main(String args[]) throws IOException {
		FileAppender fileappender = new FileAppender(new HTMLLayout(), "mylog1.html");
		//FileAppender fileappender = new FileAppender(new PatternLayout(), "mylog.txt");
		
		logger.addAppender(fileappender);
	    
	    logger.debug("this is debug message");
	    logger.info("this is info");
	    logger.error("this is error");
	    
	    System.out.println("success");
		
	}

}

