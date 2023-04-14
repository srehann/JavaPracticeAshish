package encap1;

public class Encap {
	public static void main(String[] args) {
		Parent obj=new Parent();
		obj.setAge(19);
		obj.setName("Ashish");
		obj.setSalary(90000);
		System.out.println("Name of the person "+obj.getName());
		System.out.println("Age of the person "+obj.getAge());
		System.out.println("Salary of the "+obj.getName()+" is "+obj.getSalary());
		
	}

}
