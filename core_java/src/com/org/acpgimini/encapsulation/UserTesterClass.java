package com.org.acpgimini.encapsulation;

public class UserTesterClass {
	public static void main(String[] args) {
		
	
	User user1=new User("mike","query",123);
	System.out.println(user1);
	User user2=new User();
	user2.setUsername("abinash");
	user2.setPassword("12345");
	user2.setUserid(1234);
	System.out.println(user2);
	System.out.println("user2 id:"+user2.getUsername());
	System.out.println("user2 name"+user2.getUserid());
	}
}
     