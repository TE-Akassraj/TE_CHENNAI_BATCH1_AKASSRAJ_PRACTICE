package com.excercise.oneand3;

public class bank {

		private Long balance;
			
			public bank() {
				this.balance = 15000l;
			}
			
			public Long getBalance() {
				return this.balance;
			}
			
			public void withDraw(long withDrawAmount) {
				if (withDrawAmount <= balance) {
					this.balance -= withDrawAmount;
					System.out.println("With Draw Successfull");
					System.out.println("Current Balance : " 
						+ getBalance());
				} else {
					System.out.println("Insufficient Amount");
				}
			}

			public void deposite(long depositeAmount) {
				if (depositeAmount >= 100) {
					this.balance += depositeAmount;
					System.out.println("Deposite Successfull");
					System.out.println("Current Balance : " + getBalance());
				} else {
					System.out.println("Amount Should be more than 100");
				}
			}
		}


