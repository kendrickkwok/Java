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
public class binarySearch {
//       int[] nums = {1,2,3,4,5,6,7,8,9};
//       binarySearch bs = new binarySearch();
//       bs.binarySearching(nums, 0, (nums.length)-1, 3);  
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        binarySearching(nums, 0, (nums.length)-1, 9); 
    }
    public static void binarySearching(int[] nums,int indexLeft, int indexRight, int target)
    {
        int middle = (indexLeft+indexRight)/2;
        System.out.println(middle);
        if(middle == target)
        {
            System.out.println("Found " + middle);
        }
        
        if (target > middle)
        {
            indexLeft = middle;
            binarySearching(nums,indexLeft,indexRight,target);
        }
        
        if (target < middle)
        {
            indexRight = middle;
            binarySearching(nums,indexLeft,indexRight, target);
        }
        
        
    }
}
