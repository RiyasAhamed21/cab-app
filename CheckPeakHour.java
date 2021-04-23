package com.riyasahamed;

public class CheckPeakHour {

	// This Method Checks whether the journey time is in Peak Hour or NOt and Calculates the Peak Hour Charges
	public static float peakCharge(int hour, float bill) {
	if((hour>=17)&&(hour<=19)) {
		System.out.println("Since the Journey Time is in Peak Hours - Extra Charges may applicable");
		bill= (float) (bill+(0.10*bill));
		System.out.println("Fair Will be Rs." + bill);
	}
	return bill;
}
}
