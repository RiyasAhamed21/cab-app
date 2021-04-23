package com.riyasahamed;

public class CheckPassword {
	// This Method Validates the Password
	public static boolean checkpass(String pass){
		
		boolean flag= false;		
		if(pass.length()>=8) {
			flag=true;
		}
		return flag;
	}

}
