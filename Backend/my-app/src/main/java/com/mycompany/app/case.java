	
/*package com.mycompany.app;	
public class case
	{
	public int change(String x)
	{	int i, len;
		len=x.length();
		for(i=0; i<=len; i++)
		{
			if (x.charAt(0)==x.upper())	
				return 0;		
		}
		return 1;
			
	}
	
	public String answer(String text) 
	{
		int i,j,x,len;
				
		len=text.length();
		
		String[] arr= new String[chatAt(i).upper];
		
		int count=0;
		//Appending 
		for(i=0; i<=len; i++)
			{
				arr[count]=text.substring(i);
				count+=1;
			}
			
			string change= arr[0];
			for(i=0; i<arr.length; i++) 
	
				change=arr[i];

		return change;
	
	}
 }
 
}*/
package com.mycompany.app;

public class case {
 
    public String main(String[] args,String x,String y)
    {
        int temp;
        String result = "";
        
        for(int i=0;i<x.length();i++){
        
        	if( y == "lower" ){ // for upper put y=upper
        	
				if( (int)x.charAt(i) >=65 && (int)x.charAt(i) <= 90){ // and the ascii value will change to 97 and 122
					temp = (int)x.charAt(i) + 32; //+ will become -
					result = result + (char)temp; 
				}
					
				else
					result = result + x.charAt(i);
			}
						}
        }
        

			return result;
}
}


