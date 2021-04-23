package com.riyasahamed;

public class CheckMobileNo {
	// This Method Validates the Mobile Number 
	public static String mobileno(String mobNo ) {
			String S="InValid Mobile Number";
		if(mobNo.length()==10) {
			  S="valid Mobile Number";
		}
			return S;	

	}

}
