package com.org.acpgimini.collection;

import java.util.HashMap;

import com.org.acpgimini.encapsulation.User;

public class UserHashMap {
	public static void main(String[] args) {
		HashMap<String,User> userHashMap=new HashMap<String,User>();
		User user1=new User();
		User user2=new User();
		User user3=new User();
		User user4=new User();
		user1.setUserid(123);
		user1.setUsername("abinash");
		user1.setPassword("abinash");
		user2.setUserid(123);
		user2.setUsername("abinash");
		user2.setPassword("abinash");
		user3.setUserid(123);
		user3.setUsername("abinash");
		user3.setPassword("abinash");
		user4.setUserid(123);
		user4.setUsername("abinash");
		user4.setPassword("abinash");
		userHashMap.put("1st-user", user1);
		userHashMap.put("2st-user", user2);
		userHashMap.put("3st-user", user3);
		userHashMap.put("4st-user", user4);
		//retrival of user
		System.out.println(userHashMap);
		//update of user data
	    user4.setUsername("qwerty");
	    userHashMap.put("4th-user", user4);
	    //retrival of user after update
	    System.out.println("userhashmap after updation");
	    System.out.println(userHashMap);
	    System.out.println("****************");
	    //delation
	    userHashMap.remove("3rd-user");
	    //retriving after delation
	    System.out.println("afterdelation");
	    System.out.println(userHashMap);
	    
	    
	    		
	}

}
