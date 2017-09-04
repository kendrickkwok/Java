/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//        StringUniqueHash test = new StringUniqueHash();
//        test.checkAllUnique2("Somethingggggg");

package ArraysAndStrings;

import java.util.*;
//import java.util.Map;
import java.util.HashMap;
//import java.util.Iterator;
/**
 *
 * @author Joseph
 */
public class StringUniqueHash {
    
    
    public void checkAllUnique(String sentence)
    {
        Map<Character, Integer> mapping= new HashMap<Character, Integer>();
        char[] arr = sentence.toCharArray();
        
        for(char value : arr)
        {
            if (mapping.containsKey(value))
            {
                mapping.put(value, mapping.get(value)+1);
            }
            
            else{ mapping.put(value, 1);}
        }
        
        System.out.println(mapping);
    }
    
    public void checkAllUnique2(String sentence)
    {
        Map<Character, Integer> mapMe = new HashMap<Character, Integer>();
        char[] arr = sentence.toCharArray();
        
        for (char value:arr)
        {
            if(mapMe.containsKey(value))
            {
                System.out.println("Same Character found.");
                break;
            }
            else {mapMe.put(value, 1);}
        }
        
        System.out.println(mapMe);
    }
}
