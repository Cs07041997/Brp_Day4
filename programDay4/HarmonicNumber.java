package com.bridgelabz.programDay4;

import java.util.Scanner;

public class HarmonicNumber {
	
	 public  void numHarmonic(double n) {
		 double H0 = 0;
		 while(n>0) {
		 H0 = (H0+(1/(n+1)));
		 n--;
		 System.out.print(" "+H0);
		 }
	 }

	public static void main(String[] args) {
		HarmonicNumber hn = new HarmonicNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		double n=sc.nextInt();
		System.out.print("The harmonic series is : ");
		hn.numHarmonic(n);

	}

}
