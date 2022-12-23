package javaNumberProgram;

public class PrimeNumber1to100 {

	public static void main(String[] args) 
	{
		int a=0;
		int n=0;
		int b=1;
		int c=1; 

		System.out.println("Prime numbers from 1 to 100 are :");

		while(n<25)  
		{  
			c=1;  
			a=0;  
			while(c<=b)  
			{  
				if(b%c==0)  
					a++;  
				c++;   
			}  
			if(a==2)  
			{  

				System.out.printf("%d ",b);  
				n++;  
			}  
			b++;  
		}    
	}  

}


