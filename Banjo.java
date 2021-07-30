/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 *
 * @author user
 */
public class Banjo extends Instrument {
    private int no_of_strings;
    private double string_size;

    public int getNo_of_strings() {
        return no_of_strings;
    }

    public void setNo_of_strings(int no_of_strings) {
        this.no_of_strings = no_of_strings;
    }

    public double getString_size() {
        return string_size;
    }

    public void setString_size(double string_size) {
        this.string_size = string_size;
    }
    
    
    /*
     @Override
    public void getDetails()
    {
        
    }
    
    @Override
    public void printDetails()
    {
        
    }
*/
}
