package javaNumberProgram;

public class FibonacciNumber
{
	/**
	 * a series of numbers in which each number ( Fibonacci number ) 
	 * is the sum of the two preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//int n=10;
		int f1=0;
		int f2=1;
		int f3;
		
		for(int i=2;i<=10;i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			System.out.println(f3);
			
		}
		
	}
	
}
