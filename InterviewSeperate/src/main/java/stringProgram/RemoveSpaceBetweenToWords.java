package stringProgram;

public class RemoveSpaceBetweenToWords
{
	public static void main(String[] args) 
	{
		String s="Tushar Bedkute";
		String s1=s.replaceAll(" ", "");
		System.out.println(s1);


		char[] s2 = s.toCharArray();    //IT IS USED TO CONVERT GIVEN STRING INTO THE SEQ OF CHARAC
		                                 // THE RETURNED ARRAY LENGHT IS EQUAL TO THE LENGHT OF THE STRING
		
		StringBuffer stringBuffer = new StringBuffer();  
		for (int i = 0; i < s2.length; i++)
		{  
			if ((s2[i] != ' ') && (s2[i] != '\t'))
			{  
				stringBuffer.append(s2[i]);       // APPEND WHICH IS USED TO ADD DATA IN A FILE 
			}                                     // WE CAN ADD BOOLEAN , STRING, CHAR ETC
		}  
		String noSpaceStr2 = stringBuffer.toString();  // TOSTRING WHICH IS USED TO RETURN THE STRING
		                                               //REPRESENTING THE DATA CONTAINED BY THE STRING BUFFER OBJECT
		System.out.println(noSpaceStr2);  





	}

}
