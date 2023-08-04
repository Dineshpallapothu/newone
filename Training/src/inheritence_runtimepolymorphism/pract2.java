package inheritence_runtimepolymorphism;
class A{
	int anu;
	int num;
	
	public A() {
		//super();
		this(40,50);
	}
	
	
	public A(int anu, int num) {
		super();
		this.anu = anu;
		this.num = num;
		System.out.println("base prog");
		
	}
	
	
}

public class pract2 {

	public static void main(String[] args) {
		A a=new A();
		

	}

}
