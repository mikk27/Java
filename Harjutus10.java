package ISK20töö;

public class Harjutus10 {

	public static void main(String[] args) {
			reastus();

}
	//alamprogramm
	static void reastus() {
		for (int i = 1; i < 67; i++) { //kui i on üks, siis lisame numbri kuni 66ni
			if(i%5==1){ //määrab ära mitme kaupa arvud reas on
				System.out.println(); //jätame tühja rea vahele
			}
			System.out.print(i+" "); //prindime numbrid, mida eraldavad tühikud
		}
			
}}