/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndStrings;

/**
 *
 * @author Joseph
 */
public class ReverseStringLessTree {
       public static void main(String args[])
    {
        System.out.println(reverseString("Helllllllllo"));
    }
    
    public static String reverseString(String str)
{
	//Array for counters
	int counter = 0;
	StringBuilder sb = new StringBuilder();
	char[] arr = str.toCharArray();

        
	for (int i = arr.length-1; i >= 0; i--)
	{
		if(counter == 2 && arr[i] == arr[i-1])
		{
                }
		else
		{
                
                System.out.println(i + "." + arr[i]);
		sb.append(arr[i]);
		
                if(i != 0)
                {
		if(arr[i] == arr[i-1])
		{
			counter = counter + 1;
		}
		else
                {
                    counter = 0;
                }
                }
 }	
	}
	
return sb.toString();
}

}
