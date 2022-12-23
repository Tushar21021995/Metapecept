package javaNumberProgram;

public class EvenNumber {

	public static void main(String[] args)
	{
		int a=10;
		
		switch(a%2)
		{
		case 0:
		{
			System.out.println("Number is a even");
			break;
		}
		
		case 1:
		{
			System.out.println("Number is odd");
		}
		}
	}
}
