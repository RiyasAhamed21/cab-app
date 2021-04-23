package com.riyasahamed;

import java.time.LocalDate;
import java.util.Scanner;

public class GetDate {
		// This Method Get date rom the User...
		public static LocalDate getDate() {
		Scanner inp=new Scanner(System.in);
		System.out.println("\n             Enter Journey Deatils\n               ");
		System.out.println("Enter Date of Journey");
		String date=inp.next();
		LocalDate dateobj= LocalDate.parse(date);
		return dateobj;
	
	}

}
