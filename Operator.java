/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdtrials;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author user
 */
public class Operator {
    
    public static Musician createMusician(String name, Instrument instrument)
    {
        Musician musician = new Musician();
        musician.setName(name);
        musician.setInstrument(instrument);
        return musician;
    }
    
    public static void add(Musician musician, Band band )
    {
        band.getMemberslist().add(musician);
    }

    public static void listBandsMembersAndDetails(List<Band> bands){
        for (Band band : bands)
        {
             System.out.println(band.getName());
             Operator.showMemberDetails(band);
        }
    }
    
    public static void showMemberDetails(Band band)
    {
        for (Musician musician: band.getMemberslist())
        {
           System.out.println(musician.getName()); 
           
           if (musician.getInstrument() instanceof Guitar)
        {
            Guitar g = (Guitar) (musician.getInstrument());
            System.out.println("The member's instrument is Guitar whose properties are: ");
            System.out.println("Manufacturer : " +g.getManufacturer());
            System.out.println("Number of strings : " +g.getNo_of_strings());
            System.out.println("String size : " +g.getString_size());
        }
           else if (musician.getInstrument() instanceof Piano)
           {
            Piano g = (Piano) (musician.getInstrument());
            System.out.println("The member's instrument is Piano whose properties are: ");
            System.out.println("Manufacturer : " +g.getManufacturer());
            System.out.println("Number of keys :" +g.getNo_of_keys());
            System.out.println("Is acoustic : " +g.isAcoustic());
           }
           else if(musician.getInstrument() instanceof Synthesizer)
           {
            Synthesizer g = (Synthesizer) (musician.getInstrument());
            System.out.println("The member's instrument is Synthesizer whose properties are: ");
            System.out.println("Manufacturer : " +g.getManufacturer());
            System.out.println("Number of keys :" +g.getNo_of_keys());
            System.out.println("Has LED : " +g.isHas_led());
           }
            else if(musician.getInstrument() instanceof Banjo)
           {
            Banjo g = (Banjo) (musician.getInstrument());
            System.out.println("The member's instrument is Banjo whose properties are: ");
            System.out.println("Manufacturer : " +g.getManufacturer());
            System.out.println("Number of strings : " +g.getNo_of_strings());
            System.out.println("Has LED : " +g.getString_size());
           }
           else if(musician.getInstrument() instanceof Drums)
           {
            Drums g = (Drums) (musician.getInstrument());
            System.out.println("The member's instrument is Drums whose properties are: ");
            System.out.println("Manufacturer : " +g.getManufacturer());
            System.out.println("Has hi-hat : " +g.isHas_hi_hat());
           }
        }

    }

    public static void addMusicianToBand(Musician musician, Band band){
        band.getMemberslist().add(musician);
        System.out.println("Musician "+musician.getName() + " joined the band "+band.getName());
    }
    
     public static Musician removeRandomMusician(Band band, List<Musician> bandless)
    {
        Musician randomMusician = band.getMemberslist().get(randomPosition(band.getMemberslist().size()));
        band.getMemberslist().remove(randomMusician);
        bandless.add(randomMusician);
        return randomMusician;
    }

    public static int randomPosition(int capping)
    {
        Random rand = new Random();
        return rand.nextInt(capping);
    }

     public static void playOneNight(List<Band> bands, List<Musician> bandless)
     {
         List<Musician> foundBand = new ArrayList<>();
        for(Band band : bands)
        {
            Musician removedMusician = Operator.removeRandomMusician(band, bandless);
            System.out.println(removedMusician.getName()+" left "+band.getName());
        }
        for(Musician bandlessMusician: bandless){
            Band randomBand = bands.get(randomPosition(bands.size()));

            boolean exists = false;
            Musician rejectedMusician = new Musician();
            for(Musician musician: randomBand.getMemberslist()){
                Instrument bandlessMusicianInstrument = bandlessMusician.getInstrument();
                Instrument musicianInstrument  = musician.getInstrument();
                if(bandlessMusicianInstrument.getClass().equals(musicianInstrument.getClass())){
                    exists = true;
                    rejectedMusician = musician;
                    break;
                }
            }
            if(exists){
                System.out.println(rejectedMusician.getName()+ " could not join member with same instrument already exists in the band "+randomBand.getName());
            }
            else{
                addMusicianToBand(bandlessMusician, randomBand);
                foundBand.add(bandlessMusician);
            }
        }
        for(Musician musician: foundBand){
            bandless.remove(musician);
        }
    }
     public static void exitProgram()
     {     
      System.exit(0);
     }
}

