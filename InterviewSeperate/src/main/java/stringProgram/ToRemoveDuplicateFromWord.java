package stringProgram;

import java.util.LinkedHashSet;

public class ToRemoveDuplicateFromWord 
{
	public static void main(String[] args)
	{
		String s="tusharbedkute";
		LinkedHashSet<Character> obj = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
			obj.add(s.charAt(i));
		}
		
		System.out.println(obj);
	}

}
