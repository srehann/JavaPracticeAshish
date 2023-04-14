package Day1;

public class Day1Java {

	public void m1() 	{
		System.out.println("Hello Ashish");
	}
	public void m2() { //Non parameter method
		System.out.println("Bye Ashish");

	}
	public void m3(String name) { //Parameterised 
		System.out.println("Hi "+name);
	}
	public void m4(int a,int b) {
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
	public void m5(int a,int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void m6(String a,int b) {
		System.out.println("Name is "+a+" and age is "+b);
	}
	public void m7(String a,String b) {
		String x=a.toUpperCase();
		String y=b.toUpperCase();
	System.out.println(x    +      y);	
	}
	public static void main(String[] args) {
		Day1Java  dj=new Day1Java();
		dj.m1();
		dj.m2();
		dj.m3("Ashish");
		dj.m4(10, 20);
		dj.m5(1,2,3);
		dj.m6("sahil",10);
		dj.m7(" ashish "," malhotra ");
	}
	
}
