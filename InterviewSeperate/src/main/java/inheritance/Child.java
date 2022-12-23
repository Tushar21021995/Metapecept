package inheritance;

public class Child extends Parent

{
	public void method()
	{
		System.out.println("method of child ");
	}
	
	public static void main(String[] args) 
	{
		Parent p = new Parent();
		Child c = new Child();
		p.method();
		c.method();
	}

}
