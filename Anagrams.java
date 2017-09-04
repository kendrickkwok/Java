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
public class Anagrams {
   
    public String check(String str)
    {
        char[] arr = str.toCharArray();
        java.util.Arrays.sort(arr);
        return new String(arr);
    }
    public Boolean theSame(String str1, String str2)
    {
        return check(str1).equals(check(str2));    
    }
}
