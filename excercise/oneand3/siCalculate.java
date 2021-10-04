package com.excercise.oneand3;

import java.util.Scanner;

public class siCalculate {
	public static void main(String[] args) {
		System.out.println("enter the principle");
		simpleInterest ref = new simpleInterest();
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("enter the rate of interest");
		int b = s.nextInt();
		System.out.println("enter the time");
		int c = s.nextInt();
		s.close();
		System.out.println(ref.interest(a,b,c));

	
	}

}
