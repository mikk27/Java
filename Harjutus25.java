package ISK20töö;

import java.io.*;
import java.util.ArrayList; //võimaldab manipuleerida ja lisada
import java.util.Random; // võimaldab genereerida suvalisi numbreid

public class Harjutus25 {

	//Prindib välja ID koguarvu, ehk mitu õpilast on nimekirjas
    public static void showkõikõpilased(ArrayList<Main> dataList){  //tekitame "andmebaasi" nimega showkõikõpilased mis liiguvad meie tabelisse
          System.out.println("1. Kokku kasutajaid:"+(dataList.size()-1));  //-1, kuna alustame lugemist nullist.
        }
    
    public static void showkümmeõpilast(ArrayList<Main> dataList){  
          System.out.println("\n2. Esimese kümne kasutaja info: ");
        for (int i = 0; i <= 10; i++) {  //kui i on väiksem kui 10, siis lisame +1 kuni saame 10 täis
            Main item = dataList.get(i); //võtame tabelist 10 elementi
            //prindime välja id, eesnime, perenime, emaili ja soo.
            System.out.println(item.id+"\t\t"+item.first+"\t\t"+item.last+"\t\t"+item.email+"\t\t"+item.gender); // (\t) tähendab, et jätame topelttühiku vahele aka. tab klahv.
            
            
        
        }
    }
    
    public static void showsuvalisedõpilased(ArrayList<Main> dataList){
        
        System.out.println("\n2. Kolm suvalist õpilast: "); // (\n) tähendab, et kirjutame uuelt realt aka enter klahv.
        Main item = dataList.get(0);
        System.out.println(item.id+"\t\t"+item.first+"\t"+item.last+"\t\t"+item.email+"\t\t\t"+item.gender);
        
        
        Random r = new Random();
        int high = dataList.size(); //määrame, et suvaliselt valitakse KÕIKIDE kasutajate hulgast
        for (int i=1 ; i<4;i++){ //määrab, et loop töötab 3 korda, ehk väljastame 3 nime
            int random = r.nextInt(high); // suvaliselt genereerime kasutajad mida prindime
            Main randomItem = dataList.get(random); 
            
            //et oleks lihtsam aru saada, lisame päised ka kus näeme ID, nime, emaili ja sugu
            System.out.println(randomItem.id+"\t\t"+randomItem.first+"\t\t"+randomItem.last+"\t\t"+randomItem.email+"\t\t"+randomItem.gender);
            
        }

    }
    
     public static void showemailid(ArrayList<Main> dataList){ 
          System.out.println("\n4. Kuvan ainult emailid: ");
        for (int i = 0; i < dataList.size(); i++) { //loop jookseb kuni emailid lõppevad
            Main item = dataList.get(i);
            System.out.println(item.email);
            
        
        }
    }
     
     public static void showesitähed(ArrayList<Main> dataList){
          System.out.println("\n5. Eesnime esimesed tähed: ");
        for (int i = 1; i < dataList.size(); i++) { //alustame loopi esimesest nimest ja töötame tabeli lõpuni, kuni kõik nimed on läbi.
            Main item = dataList.get(i);  //tirime sisse meie andmed
            String name = item.first; //määrame, et kasutame eesnimesid
            char first = name.charAt(0); // prinditavat nime kuvame esimese tähe järgi
            System.out.println(first);
           
            
        
        }
    }
     //genereerime suvalise parooli perekonnanime lõppu
     public static void generatePassword(ArrayList<Main> dataList){ 
         Random r = new Random();
        //kahekohalised suvalised numbrid 10-99
        int low = 10; 
        int high = 99;
        
        System.out.println("\n6. Paroolid kasutajatele(perenimi+suvalinenr)");
        for (int i = 0; i < dataList.size(); i++) { //võtame kogu tabeli algusest lõpuni
            Main item = dataList.get(i); 
            String last = item.last; //võtame perenime
            int random = r.nextInt(high-low); //lisame suvalised nr 10-99
            System.out.println(last+random); //prindime perenime+suvalisenr
            
            
        
        }
    }
    
    //tehnilisem pool
  public static void main(String[] args) throws IOException { 
    
      String file = "C:/Users/Gamer1/Desktop/students.csv"; //asukoht, kus csv faili tuleb lugeda
      BufferedReader reader = null;
      String line = "";
      ArrayList<Main> dataList = new ArrayList<Main>();
      try{
          reader = new BufferedReader(new FileReader(file));
          
          System.out.println("Kuvan kogu informatsiooni, alustades esimesest punktist:");
          while((line = reader.readLine()) != null){
             
              String[] row = line.split(","); // ridade eraldaja on koma.
              Main data = new Main(row[0],row[1],row[2],row[3],row[4]); //meie andmed paiknevad 4 sektsioonil
              dataList.add(data); //lisame nad ühte suurde tabelisse kokku
              
          }

      }catch(Exception e){ 
          e.printStackTrace();
          
      }finally{
           reader.close();
           
      }
      
      
      // prindin välja kõik informatsiooni kasutades eelmiseid funktsioone
      showkõikõpilased(dataList);
      showkümmeõpilast(dataList);
      showsuvalisedõpilased(dataList);
      showemailid(dataList);
      showesitähed(dataList);
      generatePassword(dataList);
  }
    
}
