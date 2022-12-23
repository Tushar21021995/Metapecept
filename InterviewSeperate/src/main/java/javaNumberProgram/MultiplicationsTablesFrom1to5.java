package javaNumberProgram;

public class MultiplicationsTablesFrom1to5
{
	public static void main(String[] args)
	{
		System.out.println("Multiplication Tables from 1 to 5");
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println((j+"*"+i+"="+j*i+" "));
			}
		}
		System.out.println();
		
	}

}
