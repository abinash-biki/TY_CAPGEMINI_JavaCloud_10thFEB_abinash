package com.capgemini.log4g.log4g;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class InsertData {
Logger log=LogManager.getLogger(InsertData.class);
 void store()
{
	log.debug("i am abinash");
}
 public static void main(String[] args) {
	InsertData in=new InsertData();
	in.store();
}

}
