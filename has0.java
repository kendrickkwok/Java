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
public class has0 {
    
    public static void main(String args[])
    {
        //int[] arr = {1,2,3,4,5};
       // System.out.println(Palindrome("catdoggodtac"));    
       //arrayShift(arr, 2);
        System.out.println(findAll0(110));
    }
    
    //static void arrayShift(int arr[], int target)
    public has0()
    {
        System.out.println("Created an object");
    }
    
    public static int test(int n)
    {
        return n;
    }
    
    public static int findAll0(int num)
    {
        int counter = 0; 
        
        for(int i = 1; i <= num; i++)
        {            
            if(has0(i))
                counter++;
        }
        
        //System.out.println(7/10);
        return counter;
    }
    
    public static Boolean has0(int num)
    {
        while (num!=0)
        {
            if(num%10 == 0)
            {
                return true;
            }
            num = num/10;
        }
        
        return false;
    }
}
