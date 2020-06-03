package com.techment;

import org.apache.log4j.Logger;


public class LogExample {
	
  public LogExample() {
	  
  }
  
  static Logger log = Logger.getLogger(LogExample.class);
  public static void main(String[] args) {
	  log.debug("here is some DEBUG");
	  log.info("here is some DEBUG");
	  log.warn("here is some DEBUG");
	  log.fatal("here is some DEBUG");
	  
  }
}
