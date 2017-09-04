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
public class RetainAll {
    
    public static void main(String[] args)
    {
    String orig[] = { "1st", "2nd", "3rd", "4th", "5th", "1st", "2nd", "3rd",
        "4th", "5th" };
    String act[] = { "2nd", "3rd", "6th" };
    List origList = new ArrayList(Arrays.asList(orig));
    List actList = Arrays.asList(act);

    //String[] stockArr = new String[stockList.size()];
    System.out.println(origList.retainAll(actList));
    System.out.println(origList);
    }
    
    public static void retainAll(int[] array, int[] array2)
    {
        
        List origList = new ArrayList(Arrays.asList(array));
        List origList2 = new ArrayList(Arrays.asList(array2));
        
        origList.retainAll(origList2);
        System.out.println(origList);
        
    }
}
