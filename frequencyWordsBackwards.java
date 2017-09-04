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
public class frequencyWordsBackwards {
    
    public String fq(String str)
    {
        Map<Character, Integer> myMap = new HashMap<Character,Integer>();
        char[] charArr = str.toCharArray();
        ArrayList al = new ArrayList();
        int max;
        
        for(char value : charArr)
        {  
            if(myMap.containsKey(value))
            {
                myMap.put(value, myMap.get(value)+1);
            }
            
            else
            {
                myMap.put(value, 1);
            }
        }
       
        System.out.println(myMap);
        Iterator it = myMap.entrySet().iterator();
        while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        al.add(pair.getKey());
        al.add(pair.getValue());
        it.remove(); // avoids a ConcurrentModificationException
    }
        for (Object obj : al)
        {
            
        }
        
        for(int i = 0; i < al.size(); i++)
        {
         //  al[i]; 
        }
        
        return str;        
    }
}
