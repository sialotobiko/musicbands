/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gdtrials;
import javax.management.MBeanNotificationInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


//class BandList{
//List<Band> listOfBands = new ArrayList<>();
//
//public void add(Band band){
//    listOfBands.add(band);
//}
//
//
//
//}

/**
 *
 * @author user
 */
public class GDTRIALS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       
       
        
        //Creating a Bands list that contains the name of the band
        List<Band> Bands = new ArrayList<>();
        List<Musician> bandless = new ArrayList<>();

        //Creating new bands and initializing their names
        Band band1 = new Band();
        band1.setName("Spoke n' Hub");

        Band band2 = new Band();
        band2.setName("Berats");

        Band band3 = new Band();
        band3.setName("Hawks");

//        instances of instruments
        Guitar guitar = new Guitar();
        guitar.setManufacturer("Hp");
        guitar.setNo_of_strings(16);
        guitar.setString_size(9);

        Piano piano = new Piano();
        piano.setManufacturer("Dolby");
        piano.setNo_of_keys(24);
        piano.setAcoustic(false);

        Banjo banjo = new Banjo();
        banjo.setManufacturer("Lenovo");
        banjo.setNo_of_strings(11);
        banjo.setString_size(7);

        Drums drums = new Drums();
        drums.setManufacturer("BGS");
        drums.setHas_hi_hat(true);


//        instances of musicians
        Musician musicianA = new Musician();
        musicianA.setName("Alex"); musicianA.setInstrument(piano);
        Musician musicianB = new Musician();
        musicianB.setName("Rehema"); musicianB.setInstrument(guitar);
        Musician musicianC = new Musician();
        musicianC.setName("James"); musicianC.setInstrument(drums);
        Musician musicianD = new Musician();
        musicianD.setName("Lilly"); musicianD.setInstrument(banjo);
        Musician musicianE = new Musician();
        musicianE.setName("Lookman"); musicianE.setInstrument(piano);
        Musician musicianF = new Musician();
        musicianF.setName("Raul"); musicianF.setInstrument(piano);
        Musician musicianG = new Musician();
        musicianG.setName("Matilda"); musicianG.setInstrument(guitar);
        Musician musicianH = new Musician();
        musicianH.setName("Rosemary"); musicianH.setInstrument(drums);

//      initializing bands with some members
        band1.getMemberslist().add(musicianA);
        band1.getMemberslist().add(musicianB);
        band2.getMemberslist().add(musicianC);
        band2.getMemberslist().add(musicianD);
        band3.getMemberslist().add(musicianE);
        band3.getMemberslist().add(musicianF);

//      initializing bandless musicians
        bandless.add(musicianG);
        bandless.add(musicianH);

        Bands.add(band1);
        Bands.add(band2);
        Bands.add(band3);

        /*
        for (BandTrial bt: Bands){
            System.out.println(bt.getName());
        } 
            
        
        MusicianTrial musician1 = new MusicianTrial();
        musician1.setName("Liza Baar");
        Guitar guitar1 = new Guitar();
        guitar1.setNo_of_strings(5);
        guitar1.setString_size(0.4);
        guitar1.setManufacturer("Bender");
        
        musician1.setInstrument(guitar1);
        band1.getMemberslist().add(musician1);
        
        System.out.println(band1.getName());
        System.out.println(band1.getMemberslist().get(0).getName());
        System.out.println(band1.getMemberslist().get(0).getInstrument().getManufacturer());
       // System.out.println(band1.getMemberslist().get(0).getInstrument().getNo_of_strings());
        System.out.println(band1.getMemberslist().get(0).getInstrument() instanceof Piano);
        
        if (band1.getMemberslist().get(0).getInstrument() instanceof Guitar)
        {
            Guitar g = (Guitar) (band1.getMemberslist().get(0).getInstrument());
            System.out.println("Number of strings :" +g.getNo_of_strings());
            System.out.println("The string size :" +g.getString_size());
        }
        */
         String memberband;
//       while (false){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the name of the musician");
//            String name = sc.nextLine();
//
//            if(name.equals("no"))
//            {
//
//               break;
//            }
//
//            System.out.println("Enter the name of the instrument");
//            String instrument = sc.nextLine().toLowerCase();
//
//            /*if (instrument.equals("piano"))
//                    {
//                         Piano piano = new Piano();
//             System.out.println("Enter the number of keys");
//            piano.setNo_of_keys(sc.nextInt());
//            MusicianTrial newmusician = Operator.createMusician(name, piano);
//            Operator.add(newmusician, band1);
//                    }
//            */
//           if (instrument.equals("guitar"))
//                    {
//                         Guitar guitar = new Guitar();
//
//            System.out.println("Enter the name of the manufacturer");
//            guitar.setManufacturer(sc.nextLine());
//
//             Musician newmusician = Operator.createMusician(name, guitar);
//
//             System.out.println("What band is the musician a member of?");
//             memberband = sc.nextLine();
//
//             if (memberband.equals("Spoke n' hub"))
//             {
//                  Operator.add(newmusician, band1);
//             }
//             else if (memberband.equals("Berats"))
//             {
//                 Operator.add(newmusician, band2);
//             }
//             else if (memberband.equals("none"))
//             {
//                 Operator.add(newmusician, band3);
//             }
//
//            System.out.println("Enter the number of strings");
//            guitar.setNo_of_strings(sc.nextInt());
//            System.out.println("Enter the string size in mm");
//            guitar.setString_size(sc.nextDouble());
//
//                }
//
//           else if (instrument.equals("piano"))
//           {
//               Piano piano = new Piano();
//
//            System.out.println("Enter the name of the manufacturer");
//            piano.setManufacturer(sc.nextLine());
//
//            Musician newmusician = Operator.createMusician(name, piano);
//
//             System.out.println("What band is the musician a member of?");
//             memberband = sc.nextLine();
//
//             if (memberband.equals("Spoke n' hub"))
//             {
//                  Operator.add(newmusician, band1);
//             }
//             else if (memberband.equals("Berats"))
//             {
//                 Operator.add(newmusician, band2);
//             }
//             else if (memberband.equals("none"))
//             {
//                 Operator.add(newmusician, band3);
//             }
//
//            System.out.println("Enter the number of keys");
//            piano.setNo_of_keys(sc.nextInt());
//            System.out.println("The piano is acoustic, true or false?");
//            piano.setAcoustic(sc.nextBoolean());
//
//                    }
//
//           else if(instrument.equals("synthesizer"))
//           {
//            Synthesizer synthesizer = new Synthesizer();
//
//            System.out.println("Enter the name of the manufacturer");
//            synthesizer.setManufacturer(sc.nextLine());
//
//            Musician newmusician = Operator.createMusician(name, synthesizer);
//
//             System.out.println("What band is the musician a member of?");
//             memberband = sc.nextLine();
//
//             if (memberband.equals("Spoke n' hub"))
//             {
//                  Operator.add(newmusician, band1);
//             }
//             else if (memberband.equals("Berats"))
//             {
//                 Operator.add(newmusician, band2);
//             }
//             else if (memberband.equals("none"))
//             {
//                 Operator.add(newmusician, band3);
//             }
//
//            System.out.println("Enter the number of keys");
//            synthesizer.setNo_of_keys(sc.nextInt());
//            System.out.println("The synthesizer has LED, true or false?");
//            synthesizer.setHas_led(sc.nextBoolean());
//
//           }
//
//           else if(instrument.equals("banjo"))
//           {
//               Banjo banjo = new Banjo();
//
//            System.out.println("Enter the name of the manufacturer");
//            banjo.setManufacturer(sc.nextLine());
//
//            Musician newmusician = Operator.createMusician(name, banjo);
//
//             System.out.println("What band is the musician a member of?");
//             memberband = sc.nextLine();
//
//             if (memberband.equals("Spoke n' hub"))
//             {
//                  Operator.add(newmusician, band1);
//             }
//             else if (memberband.equals("Berats"))
//             {
//                 Operator.add(newmusician, band2);
//             }
//             else if (memberband.equals("none"))
//             {
//                 Operator.add(newmusician, band3);
//             }
//
//            System.out.println("Enter the number of strings");
//            banjo.setNo_of_strings(sc.nextInt());
//            System.out.println("Enter the string size in mm");
//            banjo.setString_size(sc.nextDouble());
//
//           }
//
//           else if(instrument.equals("drums"))
//           {
//               Drums drum = new Drums();
//
//            System.out.println("Enter the name of the manufacturer");
//            drum.setManufacturer(sc.nextLine());
//
//            Musician newmusician = Operator.createMusician(name, drum);
//
//             System.out.println("What band is the musician a member of?");
//             memberband = sc.nextLine();
//
//             if (memberband.equals("Spoke n' hub"))
//             {
//                  Operator.add(newmusician, band1);
//             }
//             else if (memberband.equals("Berats"))
//             {
//                 Operator.add(newmusician, band2);
//             }
//             else if (memberband.equals("none"))
//             {
//                 Operator.add(newmusician, band3);
//             }
//
//            System.out.println("The drum set has hi-hat, true or false?");
//            drum.setHas_hi_hat(sc.nextBoolean());
//
//           }
//
//           else
//           {
//               System.out.println ("Invalid instrument");
//           }
//        }
        
//        for (Band band : Bands)
//        {
//            System.out.println(band.getName());
//             Operator.showMemberDetails(band);
//        }
        
        //Lose members
        
//        Musician musician1 = new Musician();
//        System.out.println("The random musician selected is " +musician1.getName());
//        Operator.selectRandomMusician(Bands);
//
//        System.out.println("The random musician will now be removed from their band");
//        Operator.removeRandomMusician();
        while(true){
            System.out.println("0---------------------------------------------");
            System.out.println("MUSIC BANDS");
            System.out.println("1. LIST");
            System.out.println("2. PLAY ONE NIGHT");
            System.out.println("3. EXIT");
            System.out.println("0---------------------------------------------");
            System.out.println("Bandless Band list");
            for(Musician musician: bandless){
                System.out.println(musician.getName());
            }
            System.out.println("0---------------------------------------------");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Option : ");
            int option = scanner.nextInt();

            switch (option){
                case 1: Operator.listBandsMembersAndDetails(Bands);break;
                case 2: Operator.playOneNight(Bands, bandless);break;
                case 3: Operator.exitProgram();break;
            }
        }
    }
}
