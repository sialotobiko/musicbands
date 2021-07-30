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
public class Piano extends Instrument {
    private int no_of_keys;
    private boolean acoustic;

    public int getNo_of_keys() {
        return no_of_keys;
    }

    public void setNo_of_keys(int no_of_keys) {
        this.no_of_keys = no_of_keys;
    }

    public boolean isAcoustic() {
        return acoustic;
    }

    public void setAcoustic(boolean acoustic) {
        this.acoustic = acoustic;
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
