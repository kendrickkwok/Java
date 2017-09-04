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
public class PalindromeOneAway {
        public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5, 6};
        System.out.println(palindrome1("pollop"));
    }
   /* 
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
                str = str.substring(1, str.length()-1);
            }
        }
        
        return false;
    }
    */
    public static Boolean palindrome1(String str)
    {
        Boolean oneTime = false;
        int leftIndex = 0;
        int rightIndex = str.length()-1;
        
        while(leftIndex < rightIndex)
        {
            //Makes sure that it return false after checking one time
            if (str.charAt(leftIndex) != str.charAt(rightIndex))
            {
                if(oneTime == true)
                {
                    return false;
                }

                //Test condition -- 
                if(str.charAt(leftIndex+1 ) == str.charAt(rightIndex))
                {
                    leftIndex++;
                    oneTime = true;
                }
                else if(str.charAt(leftIndex) == str.charAt(rightIndex-1))
                {
                    rightIndex--;
                    oneTime = true;
                }
                else
                {
                    return false;
                }
            }           
            leftIndex++;
            rightIndex--;
        }
        
        return true;
    }
}
