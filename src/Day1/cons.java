package Day1;

public class cons {
	// Cons - It is same like method but only there are 2 differernce
	
	// input and output operation
	public int sum(String op,int a, int b) {
		//LADDER IF ELSE 
		if(op.toUpperCase()=="ADD") 
		{
			int c=a+b;
		System.out.println("The ans is: "+c);
		
		}
		else if(op.toUpperCase()=="SUB") {
			int c=a-b;
			System.out.println("The ans is: "+c);
			
		}
		
		return 0;
		
	}

	public cons() {
		System.out.println("bye");
	}

	public static void main(String[] args) {
		cons x=new cons();	
		x.sum("SUB",10,5);
		cons x2=new cons();
		x2.sum("SUB",10,50);
			
	}

}
