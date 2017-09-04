/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndStrings;
import java.util.Set;
import java.util.HashSet;
import java.util.*;
/**
 *
 * @author Joseph
 */
public class AllPermutation {
    
    public static void main(String args[])
    {
        System.out.println(Permutation("123"));
    }
    public static Set<String> Permutation(String str)
    {
        Set<String> allPermutation = new HashSet<String>();
        	if (str == null) {
			return null;
		} else if (str.length() == 0) {
			allPermutation.add("");
			return allPermutation;
		}
       
        char firstChar = str.charAt(0);
        String rest = str.substring(1);
        
        Set<String> words = Permutation(rest);
        
        for(String newString: words)
        {
            for(int i = 0; i <= newString.length(); i++)
            {
                allPermutation.add(permutationAdd(newString, firstChar, i));
            }
        }
        return allPermutation;
    }
    
    public static String permutationAdd(String str, char firstChar, int i)
    {
        String first = str.substring(0, i);
        String last = str.substring(i);
        return first + firstChar + last;
    }
    
}
