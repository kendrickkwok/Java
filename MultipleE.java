^/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndStrings;
import java.util.*;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Joseph
 */
public class MultipleE {
    public static void main(String args[])
    {
        System.out.println(compressE("Heeeeeasfasfawlllllo"));
    }
    
    public static String compressE(String str)
    {
        Map<Character, Integer> mp = new HashMap<Character, Integer>();
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(char value : arr)
        {
            if(mp.containsKey(value))
            {
            }
            else
            {
                mp.put(value,1);
                sb.append(value);
            }
        }
        String str1 = sb.toString();
        return str1;
    }
}
