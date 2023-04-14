package April14;

public class HRDepartment extends encap {
public static void main(String[] args) {
	//encap obj=new encap();
	 HRDepartment obj=new  HRDepartment();
	obj.setEDesignation("HR");
	obj.setEName("Monika");
	obj.setEsalary(100000);
	System.out.println("Name of the employee is "+obj.getEName());
	System.out.println("Desgination of the employee "+obj.getEDesignation());
	System.out.println("Salary of the employee is "+obj.getEsalary());
}
}
