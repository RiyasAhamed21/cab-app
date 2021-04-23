package com.riyasahamed;
import java.util.Scanner;

public class GetPassword {
	//This Method get Password from the User..
	public static String password() {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter Password");
		String pass=inp.next();
		return pass;
	}
}
