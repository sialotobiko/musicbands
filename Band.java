/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Band {
    String name;
    List members;
    
    List <Musician> memberslist = new ArrayList();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Musician> getMemberslist() {
        return memberslist;
    }

    public void setMemberslist(List<Musician> memberslist) {
        this.memberslist = memberslist;
    }
    
    
   /* public void addMusician()
    {
       
    }
    public void removeMusician()
    {
        
    }*/
    
}
