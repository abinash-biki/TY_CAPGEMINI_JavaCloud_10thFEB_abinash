package com.capegimini.bankingproject.bankingproject.beans;

import java.io.Serializable;

import lombok.Data;
@Data 
public class UserLogin implements Serializable {
	private String username;
	private String password;
	

}
