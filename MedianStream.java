/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Joseph
 */
public class MedianStream {
    public static void main(String args[])
    {
        float arr[] = {1,2,3,4,5};
        calculateMedian(arr);
    }
    
    public static void calculateMedian(float arr[])
    {
        float[] arrSort = new float[arr.length];
        
        for(int i = 0; i < arr.length; i++)
        {   
            arrSort[i] = arr[i];
            
            if (i==0)
            {
                System.out.println(arrSort[i]);
            }
            //Even
            else if((i+1)%2 == 0)
            {
            System.out.println((arrSort[i/2]+arrSort[i/2+1])/2);
            }
            //Odd
            else
            {
                System.out.println(arr[i/2]);
            }
        }
    }
}
