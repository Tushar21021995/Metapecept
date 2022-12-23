package javaNumberProgram;

public class PrimeNumber
{
	/**
	 * A NUMBER WHICH IS DIVISIBLE BY ONE AND IT SELF ONLY IS CALLED AS PRIME NUMBER
	 * @param args
	 */
	public static void main(String[] args) 
	{
		boolean check=false;
		int prime=41;
		
		if(prime ==0 || prime ==1)
		{
			System.out.println("Inavlid number to check");
		}
		
		
		else
		{
			for(int i=2;i<prime-1;i++)
			{
				if(prime%i==0)
				{
					check=true;
				}
			}
				
				if(check)
				{
					System.out.println("No its not prime number");
				}
				
				else
				{
					System.out.println("Its Prime Number");
				}
				
			
		}
	}
	
}
