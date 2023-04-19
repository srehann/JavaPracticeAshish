package com.ATM;

import java.util.Scanner;

public class SbiBank {
	public Bank bank=new Bank();
	public SbiBank() {
		bank.setBankAccountDetails("Ashish Malhotra", "Jammu J&K", "Jammu SBI Bank", 1023456, 19, 200000);
		bank.getAccountDetail();
		
	}
	public void cashWithDraw() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the amount you want to withdraw: ");
		int a =scan.nextInt();
		bank.withdraw(a);
	}
	
	public void cashDeposit() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the amount you want to Deposit: ");
		int a =scan.nextInt();
		bank.deposit(a);
	}
	
	

}
