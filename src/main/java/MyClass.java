
public class MyClass {

	public String swapLastTwoCharacters(String str) {
		
        int length = str.length();
        
        if(length < 2) return str;
        
		char lastChar = str.charAt(length - 1);
		
        char secondLastChar = str.charAt(length - 2);
        
        String restofTheString = str.substring(0, length - 2);
        
        return restofTheString + lastChar + secondLastChar;
	}
	
	//Home Work fix the method so it will remove A from the first 2 Positions of the String
	
   
	public static String truncateAInFirst2Positions(String str) {
		if(str.length()==0)
        {
        	System.out.println("hello");
        	return "";
        }
		
		char ch1=str.charAt(0);
        char ch2=str.charAt(1);
        int flag1=1,flag2=1;
        String str2="Aa";
        
        for(int i=0;i<2;i++)
        {
           if(ch1==str2.charAt(i))
           {
        	   flag1=0;
           }
           if(ch2==str2.charAt(i))
           {
        	   flag2=0;
           }
        }
        
        if(flag1==0||flag2==0)
        {
        	if(flag1==flag2)
        	{
        		str=str.substring(2);
        	}
        	else if(flag2==0)
        	{
        		str=ch1+str.substring(2);
        	}
        	else 
        	{
        		str=str.substring(1);
        	}
        	
        }
        
		return str;
	}
}
