package com.riyasahamed;

public class CalculateGST {
// This Method Calculates GST and returns the Total Bill..	
public static float gst(float per, float bill) {
	float gst=bill*(per/100);
	float total=(float)bill+gst;
	return total;
}
}
