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
public class StringSplit {
    
    public static void LOL()
    {
    String paragraph = "Hello this is a test. I love you. You love me. Hahaha.";
    String[] split = paragraph.split("\\.");
  
    for(String asset: split)
    {
    System.out.println(asset);
    }
    }
    
    public static void main(String[] args)
    {
        LOL();
    }
}
