package com.riyasahamed;

import java.util.Scanner;

public class GetMobileNo {
	// This Method get mobile number from the user
	public static String mobile() {	 
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter Your Mobile Number");
	long mob=inp.nextLong();
	String mobstr=String.valueOf(mob);
	return mobstr;
	}

}
