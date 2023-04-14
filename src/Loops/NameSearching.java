package Loops;

public class NameSearching {
	public static void main(String[] args) {
		String names[]= {"Rani","Ashish","Don","Shivam","Shivani","Himani","Geya"};
		String name ="Ashish";
		for (String string : names) {
			if(string.equals(name)) {
				System.out.println("You are registered with us");
				break;
			}
		}
	}

}
