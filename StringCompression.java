/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndStrings;
//
//        StringCompression sc = new StringCompression();
//        System.out.println(sc.test("aaaabbbbccccddddddddddaasdfasfasf"));
import java.util.*;
/**
 *
 * @author Joseph
 */
public class StringCompression {
    
    public String StringToMap(Map mp) {
    
    StringBuilder sb = new StringBuilder();
    
    Iterator it = mp.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        sb.append(pair.getKey());
        sb.append(pair.getValue());
        it.remove(); // avoids a ConcurrentModificationException
    }
    
    String str = sb.toString();
    return str;
}
    public String test(String str1)
    {
        char[] arr = str1.toCharArray();
        Map<Character, Integer> myMap = new HashMap<Character, Integer>();
        
        for (char key : arr)
        {
            if(myMap.containsKey(key))
                myMap.put(key, myMap.get(key)+1);
            else
                myMap.put(key, 1);
        }
        
        return StringToMap(myMap);
    }
        /*
        StringBuilder sb = new StringBuilder(str1);
        
        String str2 = str1.toString();
        return str2;
        }
        */
}
