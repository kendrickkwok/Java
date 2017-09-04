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
public class arrays {
    public static void main(String[] args)
    {
        int a = 0;
        int b = 1;
                
        for (int i = 1; i < 5; i++) 
         {
                a = 2 + a;
                b = a - 3;
                System.out.println("i" + i);
                System.out.println("a = " + a);
                System.out.println("b ' " +b);
        }
    }

}
