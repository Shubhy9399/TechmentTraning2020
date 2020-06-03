package com.techment;

import org.apache.log4j.*;
import org.apache.log4j.FileAppender;

public class TTCCLayout {
	static Logger logger = Logger.getLogger("TTCCLayout.class");
	public static void main(String args[]){
		try {
			FileAppender fileappender = new FileAppender(new TTCCLayout(),"TTCCoutput.txt");
			logger.addAppender(fileappender);
			logger.info("First log");
			logger.info("Second log");
			logger.info("Third log");
			logger.info("Fourth log");
			logger.info("See your TTCCoutput.txt");
			logger.info("Exiting from the main method");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
