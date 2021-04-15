package com.riyasahamed;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;
public class CabBooking {

public static void main(String[] args) {
	Scanner inp=new Scanner(System.in);
	System.out.println("               Login Details               \n");
	System.out.println("Enter Your Mobile Number");
	long mob=inp.nextLong();
	String mobstr=String.valueOf(mob);
	System.out.println("Enter Password");
	String pass=inp.next();
	login(mobstr,pass);
	cabDetails();
	System.out.println("Enter the Cab Type you Want to travel");
	String cabtype=inp.next();
	System.out.println("Enter the Kilometers");
	int kms=inp.nextInt();
	float d=fareEstimation(cabtype,kms);
	System.out.println("\nIf you wish to book the Cab Press 1\nIf you wish to cancel Press 2\n");
	int flag=0;
	flag=inp.nextInt();
	if(flag==1)
	{
		System.out.println("\n             Enter Journey Deatils\n               ");
		System.out.println("Enter Date of Journey");
		String date=inp.next();
		LocalDate dateobj= LocalDate.parse(date);
		System.out.println("Enter Pick Up Time");
		String cabtime=inp.next();
		LocalTime timeobj=LocalTime.parse(cabtime);
		int hour = timeobj.getHour();
		System.out.println("Enter Your Date of Birth");
		String dob=inp.next();
		LocalDate dobobj= LocalDate.parse(dob);
		float peakPrice=booking(hour,d);
		System.out.println("\n               Journey Details\n");
		System.out.println("Journey Date: " + dateobj + "\nJourney Time:" + cabtime + "\nFinal Fare inclusive of all Taxes: Rs."+ peakPrice );
	    Period period = Period.between(dobobj, LocalDate.now());
	    int age=period.getYears();
	    if(age>=60) {
	    	senior(peakPrice);
	    }
	    System.out.println("\t\tBOOKING SUCESSFULL\n");
	    inp.close();
		}
	else if(flag==2)
	{
		System.out.println("\nBooking Cancelled\n");
		System.exit(0);
	}
	else
	{
		System.out.println("Invalid Input Entered\n");
	}
		}
/**
 * This Method Verifies the Credentials Entered by the User..
 * @param mobstr
 * @param pass
 */
public static void login(String mobstr, String pass) {
		if(mobstr.length()==10)
		{
			if(pass.length()>=8)
			{
				System.out.println("Valid Credentials\n");
			}
			else
			{
				System.out.println("Invalid Credentials\n");
				System.exit(0);
			}
		}
		else
		{
			System.out.println("Invalid Credentials\n");
			System.exit(0);
		}
	}
/**
 * This Method Displays the Cab Details..	
 */
public static void cabDetails() {
		System.out.println("               Cab Details               \n");
		System.out.println("AUTO -  Rs.10 Per Km\nMINI -  Rs.15 Per Km\nPRIME - Rs.20 Per Km\n");
		System.out.println("For Peak Hours Extra Charges May Applicable\n");
		}
/**
 * This Method gives the estimated price 	
 * @param cabtype
 * @param kms
 * @return Total Fare
 */
public static float fareEstimation(String cabtype, int kms) {
		System.out.println("           Price Estimation               \n");
		int fare = 0;
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
		float total;
		total=(float)(fare+(fare*0.07));
		System.out.println("Total Fare Inclusive of GST :Rs." + total);
		return total;
	}
/**
 * This Method checks the journey time and gives the final price	
 * @param hour
 * @param d
 * @return Final Price
 */
public static float booking(int hour, float d) {
		if((hour>=17)&&(hour<=19)) {
			System.out.println("Since the Journey Time is in Peak Hours - Extra Charges may applicable");
			d= (float) (d+(0.0125*d));
			System.out.println("Fair Will be Rs." + d);
		}
		else
		{
			d=d;
		}
		return d;
	}
/**
 * This Method Gives Discount for Senior Citizens
 * @param peakPrice
 */
public static void senior(float peakPrice) {
		float finalPrice=(float) (0.5*peakPrice);
		System.out.println("Since You are Senior Citizen Final fare is:Rs." + finalPrice + "\n\t\tBOOKING SUCCESFULL");
	}
}
