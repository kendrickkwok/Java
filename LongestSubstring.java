/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndStrings;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author Joseph
 */
public class LongestSubstring {
    public static void main(String args[])
    {
       System.out.println(uniqueSubString("catcatcatcatdogscs"));
    }   
    
    public static String uniqueSubString(String str)
    {
        Set<Character> set = new HashSet<Character>();
        int L = 0;
        int R = 0;
        String temp = "";
        String max = "";
       
        while(R < str.length()-1)
        {
            if(!set.contains(str.charAt(R)))
            {
                set.add(str.charAt(R));
                R++;
            }
            else
            {
                temp = str.substring(L, R);
                if(temp.length() > max.length())
                {
                    max = temp;
                }
                set.remove(str.charAt(L));
                L++;
            }
        }
        
        temp = str.substring(L, R);
                if(temp.length() > max.length())
                {
                    max = temp;
                }
        return max;       
    }
    
}
