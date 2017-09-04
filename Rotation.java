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
public class Rotation {
        public static void main (String args[])
    {
            int[] array = {1,2,3,4,5};
            
            int[] arr = rotation(array , 3);
            
            for(int i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i]);
            }
    }
    
    public static int[] rotation(int[] arr, int intRot)
    {
        if (arr == null)
        {
            throw new IllegalArgumentException("No!");
        }
        
        int length = arr.length;
        int[] rotated = new int[length];
        
        for(int i =0; i< length; i++)
        {
            rotated[(i+intRot)%length] = arr[i];
        }
        
        /*
        //Loop through the array
        for (int i = 0; i < intRot; i++)
        {
            for (int j = arr.length-1; j >0; j--)
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        
        int offset = arr.length - intRot % arr.length;
        System.out.println(offset);
        */
        return rotated;
    }
}
