package com.riyasahamed;

public class PriceEstimator {
	//This Method Calculates the Fare for the Selected Cab Type...
public static float price(String cabtype, int kms) {
	System.out.println("           Price Estimation               \n");
	float fare = 0;
	if(cabtype.equalsIgnoreCase("Auto"))
	{
		fare=kms*10;
		System.out.println("Fare without GST: Rs. " + fare);
	}
	else if(cabtype.equalsIgnoreCase("Mini"))
	{
		fare=kms*15;
		System.out.println("Fare without GST: Rs. " + fare);
	}	
	else if(cabtype.equalsIgnoreCase("Prime"))
	{
		fare=kms*20;
		System.out.println("Fare without GST: Rs. " + fare);
	}
	else
	{
		System.out.println("Cab Type Entered is Not Valid");
		System.exit(0);
	}
	return fare;
}
   
}
