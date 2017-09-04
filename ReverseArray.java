/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndStrings;

/**^
 *
 * @author Joseph
 */
public class ReverseArray {
    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] temp = (ReverseArray(arr));
        
        for(int value: temp)
        {
            System.out.println(value);
        }
    }
    
    public static int[] ReverseArray(int[] arr)
    {
    int leftIndex = 0;
    int rightIndex = arr.length-1;

        while(leftIndex <= rightIndex)
        {
            //temp is assigned to 9
            int temp = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
        
        return arr;
    } 

}
