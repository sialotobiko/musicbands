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
public class Synthesizer extends Instrument {
    private int no_of_keys;
    private boolean has_led;

    public int getNo_of_keys() {
        return no_of_keys;
    }

    public void setNo_of_keys(int no_of_keys) {
        this.no_of_keys = no_of_keys;
    }

    public boolean isHas_led() {
        return has_led;
    }

    public void setHas_led(boolean has_led) {
        this.has_led = has_led;
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
