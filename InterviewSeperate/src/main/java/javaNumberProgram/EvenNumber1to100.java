package javaNumberProgram;

public class EvenNumber1to100 {

	public static void main(String[] args)
	{
		int a=100;
		System.out.println("List of even numbers from 1 to "+a+": ");
		for(int i=1;i<=a;i++)
		{
			if(i%2==0)
			{
				System.out.print(i + " ");
			}
		}

	}

}
