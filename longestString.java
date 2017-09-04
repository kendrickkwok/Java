/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndStrings;
import java.util.*;
/**
 *
 * @author Joseph
 */
public class longestString {
    public String findLongestSubstring(String subString)
    {
        Map<Character, Integer> myMap = new HashMap<Character, Integer>();
        StringBuilder sb = new StringBuilder();
        char[] charArray = subString.toCharArray();
        String max = new String();
        
        for(char value : charArray)
        {
            if(myMap.containsKey(value))
            {
                myMap.put(value, myMap.get(value)+1);
            }
            
            else
            {
            sb.append(value);
            myMap.put(value, 1);
            }
            
            if(myMap.get(value) > 1)
            {
                String maxtest = sb.toString();
                
                if(max.length() < maxtest.length())
                {
                    max = maxtest;
                }
                sb.setLength(0);
                myMap.clear();
            }
        }
        
        return max;
    }
    
    public int[] findClosestArray(int[] nums, int target)
    {
        int[] sum = new int[3];
        
        return sum;
    }
}
