package com.excercise.oneand3;

public class checkArguments {

	public static void main(String[] args) {
		int sum = 0,count = 0;
		System.out.println("printing the command line ");
		for (String string : args) {
			System.out.print(string +" ");
			
		} 
		System.out.println();
		int a[] = new int[args.length];
		for(int i = 0;i < args.length ; i++) {
			 a[i] = Integer.parseInt(args[i]);
			sum = sum + a[i];
			count++;
			
		}
		System.out.println("sum " + (sum));
		System.out.println("average"+ " " + "=" + " " + (sum/count));
		System.out.print("printing the number of arguments in runtime");
		System.out.print(" "+ args.length);
	}
}
