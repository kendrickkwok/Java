/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndStrings;
import java.util.*;
//import java.util.Map;
import java.util.HashMap;
//import java.util.Iterator;

/**
 *
 * @author Joseph
 */
public class ArrayNested {
    
    public int nestArray(int[] nums)
    {
        Map<Integer, Integer> myMap = new HashMap<Integer,Integer>();
        
            for(int i = 0; i < nums.length; i++)
            {
                myMap.put(i, nums[i]);
            }
            
            int index = myMap.get(0);
            
        return 0;
    }
}
