package ISK20töö;
public class Harjutus12 {

	public static void main(String[] args) {
		kolmnurgadA();
		kolmnurgadB();
		kolmnurgadC();
		kolmnurgadD();
	}
	//alamprogramm
		static void kolmnurgadA() {
			int i=3,k; 
			for(i=1;i<=3;i++) // kui i on väiksem kui 3, lisame +1, ehk loop kestab 3 rida
			{
			{
			System.out.print(""); //prindib iga rea eraldi, kasutades loopi
			}
			for(k=1;k<(i*2);k++) //iga reaga lisame 1+(1*2) tärne
				//ehk 1 rida prindib 1 tärni, teine 3, kolmas 5
			{
			System.out.print("*");
			}
			System.out.println();
			}
			for(i=3;i>=0;i--) //alustame vähendamist keskmisest reast (3)
			{
			{
			System.out.print("");
			}
			for(k=3;k<(i*2);k++)  //vastupidine arvutuskäik esimesele loopile
			{
			System.out.print("*");
			}
			System.out.println();
			}
			}
		static void kolmnurgadB() {
			int ridu=5;      //seekord määrame algselt ära, et ridu on 5.
			for (int i= ridu-1; i>=0 ; i--)  //iga rida lahutame 1 tärni, kuni jõuame nulli
			{  								//käib kuni i suurem või võrdne nulliga
			for (int k=0; k<=i; k++)  //väljastame rea, mis jookseb kuni lõpevad tärnid. 
			{  						 // alustame täiesti esimeselt realt ja töötame, kuni k on väiksem või võrdne i-ga
			System.out.print("*");  
			}  
			System.out.println(); 
			}  
			} 
		
		static void kolmnurgadC() {
			System.out.println();    
			//i for rows and j for columns      
			//row denotes the number of rows you want to print  
			int ridu=5;    
			for(int i=0; i<ridu; i++)  //alustame reast 0, kui i on väiksem kui 5, siis lisame ühe tärni reale
			{    
			for(int j=0; j<=i; j++) // alustame reast 0, kui i on väiksem kui 5, siis lisame ühe rea tärnide jaoks, kuni viieni.
			{    
			System.out.print("*");   
			}   
			System.out.println();   
			}   
			}   
		static void kolmnurgadD() {
			System.out.println();
			int ridu=5; 
			for(int i= ridu+0;i>=1;i--) 
			{
			{
			System.out.print(""); 
			}
			for(int k=1;k<=i;k++) //
			{
			System.out.print("*");
			}
			System.out.println();
			}
			for(int i=0; i<ridu; i++)
			{
			for(int k=0; k<=i; k++)
			{
			System.out.print("*");
			}
			System.out.println();
			}
		}
}