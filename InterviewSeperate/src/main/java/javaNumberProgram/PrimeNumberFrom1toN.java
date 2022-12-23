package javaNumberProgram;

public class PrimeNumberFrom1toN 
{
	public static void main(String[] args) 
	{
	  System.out.println("Prime Number From 1 to 50");
	  int n=50;
	  
	 for(int i=0;i<n;i++)
	 {
		 boolean isPrime=true;
		 
		 for(int j=2;j<i;j++)
		 {
			 if(i%j==0)
			 {
				 isPrime=false;
				 break;
			 }
		 }
		 
		 if(isPrime)
		 {
			 System.out.print(i+" ");
		 }
	 }
	 
	}

}
