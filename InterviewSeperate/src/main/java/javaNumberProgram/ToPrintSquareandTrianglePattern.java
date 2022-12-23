package javaNumberProgram;

public class ToPrintSquareandTrianglePattern 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			//for(int j=1;j<=n;j++)      // TO PRINT SQAURE PATTERN

			//for(int j=1;j<=i;j++)     //  TO PRINT TRIANGLE IN INCREASING ORDER

			for(int j=i;j<=n;j++)      //   TO PRINT TRAINGLE IN DECREASING ORDER
			{
				System.out.print("* ");
			}

			System.out.println();
		}
	}

}
