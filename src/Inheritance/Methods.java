package Inheritance;

public class Methods {
	public void m(String val) {
		System.out.println("Please enter your fName "+val);
	}
	public void m1(String val) {
		System.out.println("Please enter your Last Name "+val);
	}
	public void call(Methods mm) {
		mm.m("Ashish");
		mm.m1("Malhotra");
	}
	public static void main(String[] args) {
		Methods obj=new Methods();
		obj.call(obj);
	}

}
