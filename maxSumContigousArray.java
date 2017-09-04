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
public class maxSumContigousArray {
    public static void main(String args[])
    {
        int[] arr = {2,-3,4,-3,-1,1,-5,-3};
        System.out.println(maxSubArraySum(arr));
    }
    static int maxSubArraySum(int arr[])
    {
        int max_so_far = 0;
        int max_ending_here = 0;
        
        for (int i = 0; i < arr.length; i++)
        {
            max_ending_here = max_ending_here + arr[i];
            
            if(max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            
            if(max_ending_here < 0)
            {
                max_ending_here = 0;
            }
        }
        
        return max_so_far;
    }
}
