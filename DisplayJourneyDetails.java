package com.riyasahamed;

import java.time.LocalDate;
import java.time.LocalTime;

public class DisplayJourneyDetails {
	// This Method Displays the Journey Details..
	public static void displayDetails(LocalDate date,LocalTime cabtime,float total) {
	System.out.println("\n               Journey Details\n");
	System.out.println("Journey Date: " + date + "\nJourney Time:" + cabtime + "\nFinal Fare inclusive of all Taxes: Rs."+ total );

}

}
