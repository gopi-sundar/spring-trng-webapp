package com.arizon.jee;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("arizon") && password.equals("test");
	}

}