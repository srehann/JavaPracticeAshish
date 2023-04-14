package encap1;

import java.util.Scanner;

public class Method {
	public int add(int a,int b) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the first number ");
		 a=scan.nextInt();
		System.out.println("Please enter the second number ");
		 b=scan.nextInt();
		int c=a+b;
		System.out.println("The result is "+c);
		return c;
		
	}
	
	public void m2(Method m) {
		m.add(20, 30);
		
	}
public static void main(String[] args) {
	Method m=new Method();
	m.add(10,20);
}
}
