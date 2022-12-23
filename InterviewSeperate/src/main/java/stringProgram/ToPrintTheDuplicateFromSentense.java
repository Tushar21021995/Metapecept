package stringProgram;

import java.util.LinkedHashSet;

public class ToPrintTheDuplicateFromSentense {

	public static void main(String[] args)
	{
		String s="Welcome to to chakan chakan city";
		String[] s1= s.split(" ");
		
		LinkedHashSet<String> obj = new LinkedHashSet<String>();
		
		for(int i=0;i<s1.length;i++)
		{
			obj.add(s1[i]);
		}
		
		for(String stri : obj)
		{
			int count =0;
			for(int i=0;i<s1.length;i++)
			{
				if(stri.equals(s1[i]))
				{
					count++;
				}
					
			}
			
			if(count>1)
			{
				System.out.println(stri+"="+count);
			}
		}
		
	}

}
