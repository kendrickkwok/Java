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
public class StringRotation {
    
    public Boolean isSubString(String str1, String str2)
    {
        String max, min;
        
        if(str1.length() < str2.length())
        {
            max = str2;
            min = str1;
        }
        else
        {
            max = str1;
            min = str2;
        }
        
        return max.toLowerCase().contains(min.toLowerCase());
    }
    
    public Boolean rotateString(String str1, String str2)
    {
        //str 1 = waterbottle
        //str 2 = ewaterbottl
        
        String max = str1+str1;        
        return max.toLowerCase().contains(str2.toLowerCase());
    }
}
