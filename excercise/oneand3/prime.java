package com.excercise.oneand3;

public class prime {
public static void main(String[] args) {
	System.out.println("the first ten prime numbers are");
	int num = 1,numb = 0;
	while(num != 0){
		int temp=num,count = 0;

		for(int i = 1;i<= num;i++){
        if(num % i == 0){
        	count++;
        }
		}
		if(count == 2){
			numb++;
			System.out.println("the number "+temp + "is a prime no.");
		}
		if(numb == 10){
			break;
		}
		num++;
	}
}
}
