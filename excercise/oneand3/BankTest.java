package com.excercise.oneand3;

import java.util.Scanner;

public class BankTest {

		public static void main(String[] args) {

			System.out.println(" Welcome to Union Bank Of India ");
			Scanner obj = new Scanner(System.in);
			System.out.println("enter amount to be deposit : ");
			long depositamt = obj.nextLong();
			System.out.println("enter amount to be withdrawn : ");
			long withdrawamt = obj.nextLong();
			
			bank ref = new bank();
		
			System.out.println(ref.getBalance());
			ref.deposite(depositamt);
			ref.withDraw(withdrawamt);
		}
	}

