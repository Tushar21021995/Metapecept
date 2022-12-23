package stringProgram;

import java.util.LinkedHashSet;

public class OrderOfoccuranceOfChar 
{

	public static void main(String[] args) 
	{
		String s="tushar";
		LinkedHashSet<Character> obj = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			obj.add(s.charAt(i));
		}
		
		for(Character ch :obj)
		{
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch +"="+(i+1));
					break;
				}
				
			}
		}
	}
}
