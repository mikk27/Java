package ISK20t��;

import java.io.*;
import java.util.ArrayList; //v�imaldab manipuleerida ja lisada
import java.util.Random; // v�imaldab genereerida suvalisi numbreid

public class Harjutus25 {

	//Prindib v�lja ID koguarvu, ehk mitu �pilast on nimekirjas
    public static void showk�ik�pilased(ArrayList<Main> dataList){  //tekitame "andmebaasi" nimega showk�ik�pilased mis liiguvad meie tabelisse
          System.out.println("1. Kokku kasutajaid:"+(dataList.size()-1));  //-1, kuna alustame lugemist nullist.
        }
    
    public static void showk�mme�pilast(ArrayList<Main> dataList){  
          System.out.println("\n2. Esimese k�mne kasutaja info: ");
        for (int i = 0; i <= 10; i++) {  //kui i on v�iksem kui 10, siis lisame +1 kuni saame 10 t�is
            Main item = dataList.get(i); //v�tame tabelist 10 elementi
            //prindime v�lja id, eesnime, perenime, emaili ja soo.
            System.out.println(item.id+"\t\t"+item.first+"\t\t"+item.last+"\t\t"+item.email+"\t\t"+item.gender); // (\t) t�hendab, et j�tame topeltt�hiku vahele aka. tab klahv.
            
            
        
        }
    }
    
    public static void showsuvalised�pilased(ArrayList<Main> dataList){
        
        System.out.println("\n2. Kolm suvalist �pilast: "); // (\n) t�hendab, et kirjutame uuelt realt aka enter klahv.
        Main item = dataList.get(0);
        System.out.println(item.id+"\t\t"+item.first+"\t"+item.last+"\t\t"+item.email+"\t\t\t"+item.gender);
        
        
        Random r = new Random();
        int high = dataList.size(); //m��rame, et suvaliselt valitakse K�IKIDE kasutajate hulgast
        for (int i=1 ; i<4;i++){ //m��rab, et loop t��tab 3 korda, ehk v�ljastame 3 nime
            int random = r.nextInt(high); // suvaliselt genereerime kasutajad mida prindime
            Main randomItem = dataList.get(random); 
            
            //et oleks lihtsam aru saada, lisame p�ised ka kus n�eme ID, nime, emaili ja sugu
            System.out.println(randomItem.id+"\t\t"+randomItem.first+"\t\t"+randomItem.last+"\t\t"+randomItem.email+"\t\t"+randomItem.gender);
            
        }

    }
    
     public static void showemailid(ArrayList<Main> dataList){ 
          System.out.println("\n4. Kuvan ainult emailid: ");
        for (int i = 0; i < dataList.size(); i++) { //loop jookseb kuni emailid l�ppevad
            Main item = dataList.get(i);
            System.out.println(item.email);
            
        
        }
    }
     
     public static void showesit�hed(ArrayList<Main> dataList){
          System.out.println("\n5. Eesnime esimesed t�hed: ");
        for (int i = 1; i < dataList.size(); i++) { //alustame loopi esimesest nimest ja t��tame tabeli l�puni, kuni k�ik nimed on l�bi.
            Main item = dataList.get(i);  //tirime sisse meie andmed
            String name = item.first; //m��rame, et kasutame eesnimesid
            char first = name.charAt(0); // prinditavat nime kuvame esimese t�he j�rgi
            System.out.println(first);
           
            
        
        }
    }
     //genereerime suvalise parooli perekonnanime l�ppu
     public static void generatePassword(ArrayList<Main> dataList){ 
         Random r = new Random();
        //kahekohalised suvalised numbrid 10-99
        int low = 10; 
        int high = 99;
        
        System.out.println("\n6. Paroolid kasutajatele(perenimi+suvalinenr)");
        for (int i = 0; i < dataList.size(); i++) { //v�tame kogu tabeli algusest l�puni
            Main item = dataList.get(i); 
            String last = item.last; //v�tame perenime
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
              dataList.add(data); //lisame nad �hte suurde tabelisse kokku
              
          }

      }catch(Exception e){ 
          e.printStackTrace();
          
      }finally{
           reader.close();
           
      }
      
      
      // prindin v�lja k�ik informatsiooni kasutades eelmiseid funktsioone
      showk�ik�pilased(dataList);
      showk�mme�pilast(dataList);
      showsuvalised�pilased(dataList);
      showemailid(dataList);
      showesit�hed(dataList);
      generatePassword(dataList);
  }
    
}
