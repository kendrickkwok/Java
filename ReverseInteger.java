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
public class ReverseInteger {
    public static void main(String args[])
    {
        System.out.println(reverse(-654321));
    }
    
    public static int reverse(int x)
    {
        int begin = 0;
        int endNumber = 0;
        
        if(x%10 == 0)
        {
            return 0;
        }
        
        while(x != 0)
        {
            endNumber = x % 10;
            begin = begin * 10 + endNumber;   
            x = x / 10;
        }
        
        return begin;
    }
}
