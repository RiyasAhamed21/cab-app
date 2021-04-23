package com.riyasahamed;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
public class cabBookingNew {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		String mobile=GetMobileNo.mobile();
		String pass=GetPassword.password();
		String login=CheckLogin.login(mobile,pass);
		System.out.println(login);
		DisplayCabDetails.cabtype();
		System.out.println("Enter the Cab Type you Want to travel");
		String cabtype=inp.next();
		System.out.println("Enter the Kilometers");
		int kms=inp.nextInt();
		float price=PriceEstimator.price(cabtype,kms);
		float per=8;
		float priceWithGst=CalculateGST.gst(per, price);
		System.out.println("Price With GST is: Rs." + priceWithGst);
		System.out.println("\nIf you wish to book the Cab Press 1\nIf you wish to cancel Press 2\n");
		int flag=0;
		flag=inp.nextInt();
		if(flag==1)
		{
			LocalDate date=GetDate.getDate();
			LocalTime time=GetPickupTime.getTime();
			int hour = time.getHour();
			float total=CheckPeakHour.peakCharge(hour, priceWithGst);
			int age=CalculateAge.age();
			float finalprice=CheckSeniorCitizen.seniorcitizen(age, total);
			DisplayJourneyDetails.displayDetails(date, time,finalprice);
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
		inp.close();
			}
}