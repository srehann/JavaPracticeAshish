package com.ATM;

public class Bank {
	// Deposit , Withdraw
	// bucket 
	
private String name,branch,city;
private int account, age, balance;

// this

public void setBankAccountDetails
(String name,String branch,String city,int account,int  age,int balance) 
{
	this.name=name;
	this.branch=branch;
	this.city=city;
	this.account=account;
	this.age=age;
	this.balance=balance;
	
}
public void getAccountDetail() {
	System.out.println("Name of the person "+name);
	System.out.println("Branch name of the bank "+branch);
	System.out.println("City of the bank "+city);
	System.out.println("Account number of the account "+account);
	System.out.println("Age of the "+name +" is "+age );
	System.out.println("Balance of the saving account "+balance);
}
public void deposit(int money) {
	System.out.println(balance+money +" /- is your now account balance ");
}
public void withdraw(int money) {
	
	System.out.println(balance-money +" /- is your remaining balance");
}
}
