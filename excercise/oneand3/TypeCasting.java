package com.excercise.oneand3;

public class TypeCasting {
	public static void main(String[] args) {
		int a = 10;
		long b = a;
		System.out.println("autoboxing is done " + b);
		double  c= 34.5;
		float d = (float) c;
		System.out.println("unboxing is done " + d);
		double e = (double) a;
		System.out.println(e);
	}

}
