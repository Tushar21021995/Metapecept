package javaNumberProgram;

public class PalindromeNumber 
{
	/**
	 *  A palindrome number is a number that is same after reverse. 
	 *  For example 121, 34543, 343, 131, 48984 are the palindrome numbers.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int n=121;
		int temp=n;
		int a=0;
		int b=0;
		
		while(n!=0)
		{
			
			a=n%10;
			b=b*10+a;
			n=n/10;
		}
		
		if(b==temp)
		{
			System.out.println("Its Palindrome Number");
		}
		else
		{
			System.out.println("Its not palindrome Number");
		}
		
	}

}
