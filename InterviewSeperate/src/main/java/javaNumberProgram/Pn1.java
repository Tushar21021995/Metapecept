package javaNumberProgram;

public class Pn1 {

	public static void main(String[] args) 
	{
		 //int i =0;
	      // int num =0;
	       //Empty String
	       String  primeNumbers = "";

	       for (int i = 1; i <= 100; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(int num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are :");    // MAIN PROGRAM 
	       System.out.println(primeNumbers);
	   }
	


	}


