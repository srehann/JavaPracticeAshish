package Loops;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		//odd even num
		
		//num/==0
		//10/2==0
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number");
		int num=scan.nextInt();
		if(num%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("odd numbner");
		}
		
	}

}
