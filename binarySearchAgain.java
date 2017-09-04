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
public class binarySearchAgain {
    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr,4, 0, 10));
    }
    
    public static int binarySearch(int[] arr, int target, int left, int right)
    {
        if (left > right)
            return -1;
        
        int mid = (left + right)/2;
        //System.out.println(mid);
        
        //Find the left
        //is 5 > 2
        if(arr[mid] > target)
        {
            return binarySearch(arr, target, left, mid-1);
        }
        //find the right
        else if(arr[mid] < target)
        {
            return binarySearch(arr, target, mid+1, right);
        }
        else
        {
            return mid;
        }
        
        //return 1;
    }
    
}
