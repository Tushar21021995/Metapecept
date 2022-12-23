package stringProgram;

import java.util.LinkedHashSet;

public class ToPrintTheDuplicate
{
	public static void main(String[] args) 
	{
		String s="tester";
		//System.out.println(s);
		LinkedHashSet<Character> obj = new LinkedHashSet<Character>();

		for(int i=0;i<s.length();i++)
		{
			obj.add(s.charAt(i));
		}

		for(Character ch: obj)
		{
			int count=0;

			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
					count++;
			}

			if(count>1)                             // IT WILL PRINT DUPLICATE & IF WE USE COUNT==1 IT WILL PRINT UNIQUE CHAR

			{
				System.out.println(ch+"="+count);
			}

		}
	}

}
