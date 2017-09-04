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
public class LongestPalindromicSubstring {
   // private static int leftIndex = 0 ;
   // private static int rightIndex = 0;
    private static int maxleftIndex = 0;
    private static int maxrightIndex = 0;
    private static int counter = 0;
    private static int maxCounter = 0;
    
    public static void main(String args[])
    {
    System.out.println(longestPalindromicSubstring("peoplelpoek"));
    }
    
    public static String longestPalindromicSubstring(String str)
    {
        
        if (str.length() == 2)
        {
            return str;
        }
        
        for(int i = 0 ; i < str.length(); i++)
        {
            for(int j = 1; j <str.length(); j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    System.out.println(str.charAt(i) + " -- i" + i);
                    System.out.println(str.charAt(j) + " -- j" + j);
                    
                    if(palindrome(str.substring(i, j)))
                    {
                        if(counter > maxCounter)
                        {
                            System.out.println("Found");
                            maxCounter = counter;
                            maxleftIndex = i;
                            maxrightIndex = j;
                        }
                    }
                }
                counter = 0;
            }
   
        }
        
        return str.substring(maxleftIndex, maxrightIndex);
    }
    
        public static Boolean palindrome(String str)
    {
        while(str != null)
        {
        
            if (str.length() == 0 || str.length() == 1)
        {
            return true;
        }
        
            if(str.charAt(0) != str.charAt(str.length()-1))
            {
                return false;
            }
            else
            {
                counter++;
                str = str.substring(1, str.length()-1);
            }
        }
        
        return false;
    }
}
