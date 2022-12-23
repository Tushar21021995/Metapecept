package stringProgram;

import org.apache.poi.util.SystemOutLogger;

public class ToFindMaximumLengthInStringAray
{
	public static void main(String[] args) 
	{
		String [] s= {"priyanka","adarsh","dharmasingh","aryan","pratiksha","sayali","popat","rukmini"};
		String maxilength=s[0];

		for(int i=0;i<s.length;i++)
		{
			if(maxilength.length()<s[i].length())
			{
				maxilength=s[i];
			}
		}

		for(int i=0;i<s.length;i++)
		{
			if(maxilength.length()==s[i].length())
			{
				System.out.println("Maxi length inarray is :");
				System.out.println(s[i]);
			}
		}

	}

}
