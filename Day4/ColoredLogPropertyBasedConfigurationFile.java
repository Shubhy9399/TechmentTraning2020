package com.techment;

import org.apache.log4j.Logger;

public class ColoredLogPropertyBasedConfigurationFile {
	
	static Logger logger= Logger.getLogger("ColoredLogPropertyBasedConfigurationFile.class");
	
	public static void main(String args[]) {
		
		logger.debug("This is a debug message");
		logger.info("This is a  message");
		logger.error("This is a error message");
		logger.warn("This is a warn message");
		

		System.out.println("success");
	}

}
