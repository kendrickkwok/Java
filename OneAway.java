/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndStrings;

import java.lang.*;
/**
 *
 * @author Joseph
 */

//        OneAway ow = new OneAway();
//        System.out.println(ow.choose("bale", "pale"));
public class OneAway {
    
    public boolean choose(String str1, String str2)
    {
        if(str1.equals(str2))            
            return true;
        else if (str1.length() == str2.length())
            return test(str1, str2);
        else if (str1.length() + 1 == str2.length())
            return test(str1, str2);
        else if (str1.length() - 1 == str2.length())
            return test(str2, str1);
        else
            return false;
    }
    public boolean test(String str1, String str2)
    {
        System.out.println(str1);
        System.out.println(str2);
        int index1 = 0;
        int index2 = 0;
        boolean flag = false;
        
        while(index1 < str1.length() && index2 < str2.length())
        {
            System.out.println(str1.charAt(index1));
            System.out.println(str2.charAt(index2));
            if (str1.charAt(index1) != str2.charAt(index2))
            {
                System.out.println(index1);
                /*
                if (flag = true)
                {
                    return false;
                }
                */
                //System.out.println(str1);
                StringBuilder sb = new StringBuilder(str1);
                sb.deleteCharAt(index1);
                str1 = sb.toString();                            
                System.out.println(str1);
                //index1++;
                index2++;
                flag = true;
            }
            
            if (str1.charAt(index1) == str2.charAt(index2))
            {
                index1++;
                index2++;                      
            }                        
        }
        
        return true;
    }
}
