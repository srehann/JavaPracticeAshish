package Inheritance;

public class Cal {
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public int add(int a, int b, int c) {
		int d=a+b+c;
		return d;
	}
	
	public int add(int a, int b, int c,int d) {
		int q=a+b+c+d;
		return q;
	}
	public static void main(String[] args) {
		Cal c=new Cal();
		System.out.println(c.add(10, 20));
	}

}
