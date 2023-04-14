package ne;

public class GetSet {
	public static void main(String[] args) {
		encap obj=new encap();
		obj.setAge(20);
		obj.setName("Ashish");
		System.out.println(obj.getAge());
		System.out.println("Your name is "+obj.getName());
		
		
	}

}
