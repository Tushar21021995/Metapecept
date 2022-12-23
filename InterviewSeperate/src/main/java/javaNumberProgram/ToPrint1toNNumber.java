package javaNumberProgram;

import java.util.Scanner;

public class ToPrint1toNNumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter VAlue of N");
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++)
		{
			System.out.println(i);
		}
		
	}

}
