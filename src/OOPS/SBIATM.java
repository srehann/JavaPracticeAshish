package OOPS;

public class SBIATM implements Hidden{

	@Override
	public void m() {
		System.out.println("Method");
		
	}

	@Override
	public void withDraw(int a) {
		System.out.println("Int"+a);
		
	}

	@Override
	public void language(String type) {
		System.out.println("String "+type);
	}

}
