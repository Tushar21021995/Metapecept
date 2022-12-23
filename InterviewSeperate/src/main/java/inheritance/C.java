package inheritance;

public class C extends Parent
{
	public void method()
	{
		System.out.println("method of c");
	}
	
	public static void main(String[] args) 
	{
		Parent p = new Parent();
		Child c = new Child();
		C c1 = new C();
		p.method();
		c.method();
		c1.method();
	}

}
