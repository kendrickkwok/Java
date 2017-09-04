/*
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
public class TwoSums {
    public static void main (String args[])
    {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 7;
       
        int[] answer = (TwoSums(arr, target));
        
        for (int value: answer)
            System.out.println(value);
    }
    
    public static int[] TwoSums(int[] arr, int target)
    {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < arr.length; i++)
        {
            int complement = target - arr[i];
            if(mp.containsKey(complement))
            {
                return new int[]{mp.get(complement), i};
            }
            else
            {
                mp.put(arr[i], i);
            }
        }
        System.out.println("Nothing found");
        return arr;
    }
}
