package com.bridgelabz.programDay4;

import java.util.Scanner;

public class Trig {
	
	public static void trigonometry(double degree) {
		// convert degrees to radians
        double radians = Math.toRadians(degree);
        System.out.println("radian value"+radians);
        // cos() method to get the cosine value
        double cosValue = Math.cos(radians);
        System.out.println(" cosine  value is "+cosValue);
        // sin() method to get the sine value
        double sinValue = Math.sin(radians);
        System.out.println(" sine is "+sinValue);
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the degree value");
		double degree = sc.nextDouble();
		trigonometry(degree);
	}
}
