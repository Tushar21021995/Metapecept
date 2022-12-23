package stringProgram;

public class StringbufferBakerHuges 
{

	public static void main(String []args)
	{
	       StringBuilder sb1 = new StringBuilder("xyz");
	       StringBuilder sb2 = new StringBuilder("xyz");
	       
	       System.out.println(sb1);
	       System.out.println(sb2);
	        
	        String s1 = "abc";
	        String s2 = "abc";
	        
	        if (sb1==sb2)
	        {
	            System.out.println("sb1==sb2");
	        }
	        
	        if (sb1.equals(sb2))
	        {
	            System.out.println("sb1.equals(sb2))");
	        }
        
	         if (s1==s2)
	        {
	            System.out.println("s1==s2");
	        }
	        
	        if (s1.equals(s2))
	        {
	            System.out.println("s1.equals(s2)");
	        }
	        
	     }
}
