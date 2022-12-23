package arrayProgram;

public class AdditionOfTwoArray 
{
	public static void main(String[] args)
	{
		int []a= {5,1,2,4,3};
		int []b= {2,4,5,2};

		int length=a.length;

		if(a.length<b.length)    //5<4
		{
			length=b.length;
		}
		for(int i=0;i<length;i++)
		{
			try
			{
				System.out.println(a[i]+b[i]);
			}
			catch(Exception e)
			{
				if(a.length<b.length)
				{
					System.out.println(b[i]+ "");
				}

				else
				{
					System.out.println(a[i]+"");
				}
			}
		}


	}
}


