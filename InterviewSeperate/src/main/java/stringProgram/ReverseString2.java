package stringProgram;

public class ReverseString2 {

	public static void main(String[] args) 
	{
		String s="Tushar";
		System.out.println(s);

		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));        //way 1 The charAt() method returns the character at the specified index in a string.
			                                       //The index of the first character is 0, the second character is 1, and so on.
		}
		
		
		// 2ND WAY
		
		String s1="priyanka";
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		
		System.out.println(rev);
		
		
		// 3RD WAY
		
		String s2="gopal";
		char[] c=s2.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.println(c[i]);
		}


	}

}
