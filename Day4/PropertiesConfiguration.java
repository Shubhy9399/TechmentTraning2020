package com.techment;
 
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
 
public class PropertiesConfiguration
{
    static Logger logger = Logger.getLogger(PropertiesConfiguration.class);
    public static void main(String[] args)
    {
        //PropertiesConfigurator is used to configure logger from properties file
        PropertyConfigurator.configure("log4j.properties");
 
        //Log in console in and log file
        logger.debug("Successful !!");
    }
}
