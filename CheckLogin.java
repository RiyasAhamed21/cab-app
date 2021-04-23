package com.riyasahamed;

public class CheckLogin {
	//This Method Validates the Login Credentials..
	public static String login(String mob, String pass) {
		String s="You are Succesfully Logged In...";
		if((mob.length()<10)&&(pass.length()<8)) {
			s="Invalid Mobile Number and Password";
		}
		else if(pass.length()<8) {
			s="Invalid Password";
		}
		else if(mob.length()<10)
		{
			s="Invalid Mobile Number";
		}
		return s;
	}

}
