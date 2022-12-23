package javaNumberProgram;

import java.util.Scanner;

public class ReverseNumberFromNto1
{
	public static void main(String[] args) 
	{
//		System.out.println("Reverse Number From N to 1 :");
//		int n=10;
//		for(int i=n;i>=1;i--)
//		{
//			System.out.println(i);               we can do this way also 
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int n=sc.nextInt();
		
		for(int i=n;i>=1;i--)
		{
			System.out.println(i);
			
		}
	}

}
