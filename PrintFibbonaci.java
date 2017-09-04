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
public class PrintFibbonaci {
    public static void main (String args[])
    {
        System.out.println(FibonaciSequence(4));
    }
    
    public static int FibonaciSequence(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        
        return n * FibonaciSequence(n-1);
        
    }
}
