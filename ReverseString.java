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
}
