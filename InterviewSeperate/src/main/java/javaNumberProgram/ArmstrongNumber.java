package javaNumberProgram;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int n=371;
		int temp=n;
		int p=0;

		while(n>0)
		{
			int rem=n%10;
			System.out.println(rem);    // 1 7 3
			p=(p)+(rem*rem*rem);
			n=n/10;
		}

		if(temp==p)
		{
			System.out.println("Yes.Its Armstrong Number");
		}
		else
		{
			System.out.println("No,its not armstrong number");
		}
	}

}
