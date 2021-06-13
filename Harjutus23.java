package ISK20töö;
import java.util.Random; //suvaliste numbrite kasutamiseks
import java.util.Scanner;  //et programm töötaks kuni kasutaja soovib küsime mitu raundi võib mängida.
public class Harjutus23 {

	public static void main(String[] args) {
		
		//et kasutada suvalisi numbreid koodis
		Random random = new Random();
		Scanner reader = new Scanner(System.in);
		System.out.println("Mitu raundi soovid mängida: ");
		int raundid = reader.nextInt();
		reader.close();
		//mitu raundi esialgselt teeme
		//tärning mida arvuti viskab, ühest kuueni suvaline number.
		int arvutitäring;
		//täring mida mina viskan.
		int minutäring;
		//arvuti skoor
		int arvutiskoor = 0;
		//minu skoor
		int minuskoor = 0;
		
		//loop ühest kümneni, alustame ühest ja iga loopiga lisame ühe raundi.
		for(int raund = 1; raund <= raundid; raund++ ) {
			//suvaline number nullist viieni, see on arvuti täring
			arvutitäring = random.nextInt( 6 ) +  1; //+1 lisatud, et ei tekiks olukorda kus arvuti veeretab numbri: null.
			//kasutaja täring
			minutäring = random.nextInt( 6 ) +  1; //	
			
			if (arvutitäring  > minutäring ) { // kui arvuti viskab rohkem kui mina, siis lisan tema skoorile +1
				arvutiskoor = arvutiskoor + 1;
				System.out.println("Arvuti võitis roundi: " + raund );
			} else if (minutäring > arvutitäring ) { // kui mina viskan rohkem kui arvuti, siis +1 raund minu kasuks.
				minuskoor = minuskoor + 1; 
				System.out.println("Mina võitsin roundi: " + raund);
			} else  { // kui arvuti number pole minu omast suurem ja vastupidi, siis määrame ära viigi.
				System.out.println("Round: " + raund + " on viik!");
				
			}
	}
		//võrdleme kes lõpuks võitis võrreldes skoore
		if (arvutiskoor > minuskoor ) {
			System.out.println("Arvuti võitis lahingu võites: " + arvutiskoor + "/" + raundid);
			
		} else if (minuskoor > arvutiskoor) {
			System.out.println("Mina võitsin lahingu võites: " + minuskoor + "/" + raundid);
		}else if ( minuskoor == arvutiskoor){
			System.out.println("Mäng lõppes viigiga.");
		}
	}
	
}
