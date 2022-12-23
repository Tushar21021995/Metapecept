package stringProgram;

import java.util.LinkedHashSet;

public class ToPrintHowManyTimesCharAreReapeated {

	public static void main(String[] args)
	{
		String s="tester";
		
		LinkedHashSet<Character> obj = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			obj.add(s.charAt(i));
			
		}
		
		for(Character ch :obj)
		{
			int count =0;
			
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			
			System.out.println(ch+"="+count);   // op- t=2 , e=2 , s=1 , r=1
		}
		
		

	}

}
