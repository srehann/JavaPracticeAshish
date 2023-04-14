package Loops;

public class LadderIf {
	public static void main(String[] args) {
		int a,b,c;
		a=10;
		b=3;
		c=9;
		if(a>b) {
			System.err.println("A is greater");
		}
		else if(b>c) {
			System.out.println("B is greater");
		}
		else if(a<c) {
			System.out.println("C is greater");
		}
		else {
			System.out.println("Not greater");
		}
		
	}

}
