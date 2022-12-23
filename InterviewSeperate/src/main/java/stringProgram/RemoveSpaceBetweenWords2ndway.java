package stringProgram;

public class RemoveSpaceBetweenWords2ndway {

	public static void main(String[] args)
	{
		String s="Tushar Bedkute";
		
		char[] c=s.toCharArray();
		
		StringBuffer sb = new StringBuffer();
	

		for(int i=0;i<c.length;i++)
		{
			
			if((c[i] !=' ') && (c[i] !=' '))
			{
				sb.append(c[i]);
			}
		}
		
		String sb2 = sb.toString();
		System.out.println(sb2);


	}

}
