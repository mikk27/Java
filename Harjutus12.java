package ISK20t��;
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
			for(i=1;i<=3;i++) // kui i on v�iksem kui 3, lisame +1, ehk loop kestab 3 rida
			{
			{
			System.out.print(""); //prindib iga rea eraldi, kasutades loopi
			}
			for(k=1;k<(i*2);k++) //iga reaga lisame 1+(1*2) t�rne
				//ehk 1 rida prindib 1 t�rni, teine 3, kolmas 5
			{
			System.out.print("*");
			}
			System.out.println();
			}
			for(i=3;i>=0;i--) //alustame v�hendamist keskmisest reast (3)
			{
			{
			System.out.print("");
			}
			for(k=3;k<(i*2);k++)  //vastupidine arvutusk�ik esimesele loopile
			{
			System.out.print("*");
			}
			System.out.println();
			}
			}
		static void kolmnurgadB() {
			int ridu=5;      //seekord m��rame algselt �ra, et ridu on 5.
			for (int i= ridu-1; i>=0 ; i--)  //iga rida lahutame 1 t�rni, kuni j�uame nulli
			{  								//k�ib kuni i suurem v�i v�rdne nulliga
			for (int k=0; k<=i; k++)  //v�ljastame rea, mis jookseb kuni l�pevad t�rnid. 
			{  						 // alustame t�iesti esimeselt realt ja t��tame, kuni k on v�iksem v�i v�rdne i-ga
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
			for(int i=0; i<ridu; i++)  //alustame reast 0, kui i on v�iksem kui 5, siis lisame �he t�rni reale
			{    
			for(int j=0; j<=i; j++) // alustame reast 0, kui i on v�iksem kui 5, siis lisame �he rea t�rnide jaoks, kuni viieni.
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