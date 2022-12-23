package stringProgram;

public class ToFindMiniLengthInArray 
{
	public static void main(String[] args)
	{
		String [] s= {"priyanka","adarsh","dharmasingh","aryan","pratiksha","sayali","popat","rukmini"};
		String minilength=s[0];

		for(int i=0;i<s.length;i++)
		{
			if(minilength.length()>s[i].length())
			{
				minilength=s[i];
			}
		}

		for(int i=0;i<s.length;i++)
		{
			if(minilength.length()==s[i].length())
			{
				System.out.println("Mini length in array is :");
				System.out.println(s[i]);
			}
		}

	}

}
