/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndStrings;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Joseph
 */
public class CountOccurence {
    
    public Map countFrequency(String str)
    {
        Map<Character, Integer> mp = new HashMap<Character,Integer>();
        char[] arr = str.toCharArray();
        
        for(char c : arr)
        {
            if(mp.containsKey(c))
            { mp.put(c, mp.get(c)+1);}
            else
            { mp.put(c, 1);}
        }
        return mp;
    }
}
