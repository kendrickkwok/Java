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
public class ReverseString {
    
    public static void main (String[] args)
    {
        reverseString3("Hello");
    }
    public String reverseString(String str)
    {
        int len = str.length()-1;
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();
        
        for (int i = len; i >= 0; i-- )
        {
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
    
    public static String reverseString2(String str)
    {
        StringBuilder sb  = new StringBuilder(str);
        return sb.reverse().toString();
        
    }
    
    public static void reverseString3(String str)
    {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = str.length()-1;
        char temp = 'x';
        
        while(left < right)
        {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp; 
            left++;
            right--;
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
