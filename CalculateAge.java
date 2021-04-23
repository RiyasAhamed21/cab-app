package com.riyasahamed;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class CalculateAge {
	
	// This Method Calculates age of an User..
	public static int age() {
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter Your Date of Birth");
	String dob1=inp.next();
	LocalDate dobobj= LocalDate.parse(dob1);
	Period period = Period.between(dobobj, LocalDate.now());
    int age=period.getYears();
    return age;       
}

}
