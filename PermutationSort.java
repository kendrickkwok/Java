/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndStrings;

//        PermutationSort ps = new PermutationSort();
//        System.out.println(ps.Permutation("Hello", "olleH"));

/**
 *
 * @author Joseph
 */
public class PermutationSort {
    
    public String sort(String str)
    {
        char[] mapMe = str.toCharArray();
        java.util.Arrays.sort(mapMe);
        return new String (mapMe);
    }
    
    public boolean Permutation(String str1, String str2)
    {
        if (str1.length() == str2.length())
        {
            
        return sort(str1).equals(sort(str2));
        }
        
        return false;
        
    }
}
