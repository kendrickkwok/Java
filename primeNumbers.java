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
public class primeNumbers {
    public static void main(String args[])
    {
        System.out.println(countPrimes(30));
        //System.out.println(4%2);
    }
    
    public static int countPrimes(int num)
    {
        int counter = 0; 
        
        for(int i = 2; i < num; i++)
        {
            if(i == 2 || i == 3 || i == 5)
            {
                counter += 1;
            }
            else if (i%2==0||i%3==0||i%5==0)
            {
            }
            else
            {
                counter += 1;
            }
        }
        //System.out.println(counter);
        return counter;
    }
}

