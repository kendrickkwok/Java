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
public class LongestSubstring {
       public static void main(String args[])
       {
       System.out.println(findingSubstring("catacatsdog"));
       }
      
       public static int findingFreqLength(String str)
       {
          int n = str.length();
          Set<Character> set = new HashSet<>();
          int ans = 0;
          int left = 0;
          int right = 0;
          
          //Iterate both left and right 
          while(left < n && right < n)
          {
              //if set does not contain the index
              if(!set.contains(str.charAt(right)))
              {
                  set.add(str.charAt(right));
                  right++;
                  ans = Math.max(ans, right - left);
              }
              
              else
              {
                  //Then the set does contain the letter
                  set.remove(str.charAt(left));
                  left++;
              }
          }
           return ans;
       }
       
       public static String findingSubstring(String str)
       {
          Set<Character> set = new HashSet<Character>();
        char[] arr = str.toCharArray();
        String substring = new String();
        String temp = "";
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        int left = 0;
        int right = 0;
        
        while(right != arr.length)
        {
            if(!set.contains(arr[right]))
            {
                set.add(arr[right]);
                sb.append(arr[right]);
                right++;
                //ans = Math.max(ans, right-left);
            }
            else
            {
                set.clear();
                temp = sb.toString();
                sb.setLength(0);
                
                if(temp.length() > substring.length())
                {
                    substring = temp;
                }
            }
            
        }
         temp = sb.toString();
         if(temp.length() > substring.length())
         {
            substring = temp;
         }
        return substring;
       }
       
}
