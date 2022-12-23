package methods;

public class RecursiveMethod
{
	/**
	 * method calling it self is called as recursive methodd
	 */

	public static void demo(int n)
	{
		if(n==6)
		{
			return;
		}
		System.out.println(n++);
		demo(n);
	}
	public static void main(String[] args) 
	{
		demo(1);
	}
}
