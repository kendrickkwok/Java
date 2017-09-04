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
public class Power{
    

 public static double pow(int base,int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent < 0) {
            return 1 / pow(base, -exponent);
        }
        else {
            double results = base * pow(base, exponent - 1);
            return results;
        }
    }

    public static void main(String[] args){

        System.out.println(Power.pow(-2,0));
        return ;
    }
}
