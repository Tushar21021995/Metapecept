package javaNumberProgram;

public class OddNumberFrom1to100 {

	public static void main(String[] args)
	{
		int a=100;
		System.out.println("Odd Number From 1 to "+a+" :");
		
		for(int i=1;i<=a;i++)
		{
			if(i%2==1)
			{
				System.out.print(i+" ");
			}
		}

	}

}
