package ISK20t��;
import java.util.Random; //suvaliste numbrite kasutamiseks
import java.util.Scanner;  //et programm t��taks kuni kasutaja soovib k�sime mitu raundi v�ib m�ngida.
public class Harjutus23 {

	public static void main(String[] args) {
		
		//et kasutada suvalisi numbreid koodis
		Random random = new Random();
		Scanner reader = new Scanner(System.in);
		System.out.println("Mitu raundi soovid m�ngida: ");
		int raundid = reader.nextInt();
		reader.close();
		//mitu raundi esialgselt teeme
		//t�rning mida arvuti viskab, �hest kuueni suvaline number.
		int arvutit�ring;
		//t�ring mida mina viskan.
		int minut�ring;
		//arvuti skoor
		int arvutiskoor = 0;
		//minu skoor
		int minuskoor = 0;
		
		//loop �hest k�mneni, alustame �hest ja iga loopiga lisame �he raundi.
		for(int raund = 1; raund <= raundid; raund++ ) {
			//suvaline number nullist viieni, see on arvuti t�ring
			arvutit�ring = random.nextInt( 6 ) +  1; //+1 lisatud, et ei tekiks olukorda kus arvuti veeretab numbri: null.
			//kasutaja t�ring
			minut�ring = random.nextInt( 6 ) +  1; //	
			
			if (arvutit�ring  > minut�ring ) { // kui arvuti viskab rohkem kui mina, siis lisan tema skoorile +1
				arvutiskoor = arvutiskoor + 1;
				System.out.println("Arvuti v�itis roundi: " + raund );
			} else if (minut�ring > arvutit�ring ) { // kui mina viskan rohkem kui arvuti, siis +1 raund minu kasuks.
				minuskoor = minuskoor + 1; 
				System.out.println("Mina v�itsin roundi: " + raund);
			} else  { // kui arvuti number pole minu omast suurem ja vastupidi, siis m��rame �ra viigi.
				System.out.println("Round: " + raund + " on viik!");
				
			}
	}
		//v�rdleme kes l�puks v�itis v�rreldes skoore
		if (arvutiskoor > minuskoor ) {
			System.out.println("Arvuti v�itis lahingu v�ites: " + arvutiskoor + "/" + raundid);
			
		} else if (minuskoor > arvutiskoor) {
			System.out.println("Mina v�itsin lahingu v�ites: " + minuskoor + "/" + raundid);
		}else if ( minuskoor == arvutiskoor){
			System.out.println("M�ng l�ppes viigiga.");
		}
	}
	
}
