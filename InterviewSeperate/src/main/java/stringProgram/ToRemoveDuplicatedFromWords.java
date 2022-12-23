package stringProgram;

import java.util.LinkedHashSet;

public class ToRemoveDuplicatedFromWords {

	public static void main(String[] args) 
	{
		String s="wel to to chakan city city";
		String [] s1=s.split(" ");

		LinkedHashSet<String> obj = new LinkedHashSet<String>();

		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
			obj.add(s1[i]);
		}
		System.out.println(obj);

	}

}
