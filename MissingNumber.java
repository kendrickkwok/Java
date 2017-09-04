/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndStrings;

/**
 *
 * @author Joseph
 */
public class MissingNumber {
        public static int missingNumber(int[] arr)
    {
        if (arr.length == 0)
        {
            return -1;
        }
        
        for(int i = 0; i < arr.length-1; i ++)
        {
           if((arr[i]+1 != arr[i+1]))
           {
               return (arr[i]+1);
           }                      
        }
        
        return -1;
    }
}
