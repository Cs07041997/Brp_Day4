package com.bridgelabz.programDay4;

import java.util.Scanner;

public class TemperatureConversion {
	public void tempConvert(int f ,int c) {
		double celsius ;
		double fahreinheit;
		celsius=((f-32)*5)/9;
		System.out.println("value of fahreinheit in celsius "+celsius);
		fahreinheit=((c*9)/5)+32;
		System.out.println("value of fahreinheit in celsius "+fahreinheit);
	}

	public static void main(String[] args) {
		TemperatureConversion tc = new TemperatureConversion();
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the value of fahreinheit");
		int f = sc.nextInt();
		System.out.println(" Enter the value of celcius");
		int c = sc.nextInt();
		tc.tempConvert(f, c);
	}

}
