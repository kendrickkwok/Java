/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndStrings;
import java.util.*;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author Joseph
 */
public class ValidParentheses {
    public static void main(String args[])
    {
        System.out.println(validString("[[[([()]]]]"));
    }
    
    static Boolean validString(String str)
    {
        Stack<Character> stack = new Stack<Character>();
        
        for(char c : str.toCharArray())
        {
            if(c == '[')
                stack.push(']');
            else if (c == '{')
                stack.push('}');
            else if (c == '(')
                stack.push(')');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        
        return stack.isEmpty();       
    }
}
