package javaNumberProgram;

public class PerfectNumber 
{
	public static void main(String[] args)
	{
		int n=6;
		int m=1;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				m=m+i;
			}
		}
			if(m==n)
			{
				System.out.println(n + "Number is a perfect number");
			}
			
			else
			{
				System.out.println(n + "Nuber is not a perfect number");
			}
		
		
	}

}
