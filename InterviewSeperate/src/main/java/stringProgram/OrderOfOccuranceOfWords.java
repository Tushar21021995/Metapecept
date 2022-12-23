package stringProgram;

import java.util.LinkedHashSet;

public class OrderOfOccuranceOfWords
{
	public static void main(String[] args)
	{
		String s="priyanka popat patil";
		String [] str= s.split(" ");
		LinkedHashSet<String> obj = new LinkedHashSet<String>();
		
		for(int i=0;i<str.length;i++)
		{
			obj.add(str[i]);
			
		}
		
		for(String stri : obj)
		{
			int count=0;
			
			for(int i=0;i<str.length;i++)
			{
				if(stri.equals(str[i]))
				{
					System.out.println(stri+" "+(i+1));
					break;
				}
			}
		}
	}

}
