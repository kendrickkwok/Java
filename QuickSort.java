/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndStrings;
//import java.util.swap;
/**
 *
 * @author Joseph
 */
public class QuickSort {
    
    public void main(String args[])
    {
        
    }
    
    void sort(int[] arr, int left, int right)
    {
        int index = partition(arr, left, right);
        if(left<index-1)
            //sort left haft
            sort(arr,left,index-1);
        if(right>index)
            sort(arr,right,index);
    }
    
    int partition(int[] arr, int left, int right)
    {
       int pivot = arr[(left+right)/2];
       
       while(left <= right)
       {
           //find element to swap 
           while(arr[left] < pivot)left++;
           while(arr[right] > pivot) right--;
           
           if (left <= right)
           {
              // swap(arr,left,right);
               left++;
               right--;
           }
        }
       
       return left;
    }
}
