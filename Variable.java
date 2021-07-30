/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdtrials;

import java.lang.*;

/**
 *
 * @author user
 */
public class Variable {
    int a = 10; //instance variable
    static int c = 30; //static variable
    public static void main (String [] args)
    {
        int b = 20; //local variable
        System.out.println(c);
        System.out.println(b);
        
        Variable v = new Variable();
        
        System.out.println(v.a);
    }
}
