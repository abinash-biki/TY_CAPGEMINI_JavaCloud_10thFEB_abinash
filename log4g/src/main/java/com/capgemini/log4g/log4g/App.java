package com.capgemini.log4g.log4g;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger log=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
       log.info("i am info");
       log.trace("i am trace");
       log.debug("i am debug");
       log.warn("i am warn");
       log.error("i am error");
       log.fatal("i am fatal");
    }
}
