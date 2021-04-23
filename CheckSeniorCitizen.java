package com.riyasahamed;

public class CheckSeniorCitizen {
	// This Method Gives Discount for Senior Citizens
	public static float seniorcitizen(int age,float total) {
		float finalprice=0;
		if(age>=60) {
			finalprice=total/2;
		}
		else {
			finalprice=total;
		}
		return finalprice;
	}
}
