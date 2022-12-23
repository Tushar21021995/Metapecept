package javaNumberProgram;

public class ReversingNumber 
{
	public static void main(String[] args)
	{
		int n=543;
		int b=0;
		int a=0;

		while(n!=0)
		{
			a=n%10;
		
			b=b*10+a;
		
			n=n/10;
		}
		
		System.out.println(b);

	}

}
