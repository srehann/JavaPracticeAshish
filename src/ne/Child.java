package ne;

public class Child extends Parent {
int a=30;
public static void main(String[] args) {
	Child c=new Child();
	c.property();
System.out.println(c.a);
}
}
