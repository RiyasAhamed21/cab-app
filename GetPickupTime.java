package com.riyasahamed;

import java.time.LocalTime;
import java.util.Scanner;

public class GetPickupTime {
	
	// This Method get Journey Time from the User..
	public static LocalTime getTime() {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter Pick Up Time");
		String cabtime=inp.next();
		LocalTime timeobj=LocalTime.parse(cabtime);
		return timeobj;
	}

}
