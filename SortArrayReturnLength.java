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
import java.util.*;
import java.util.Set;
import java.util.HashSet;

public class SortArrayReturnLength {
       public static void main(String args[])
    {
        int[] arr = {1,2,3,3,3, 3, 3,4,5,6,7,8,9,10};
        System.out.println(removeDuplicates(arr));
    }
       
       
public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;
}
}
