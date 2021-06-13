package ISK20töö;
import java.io.*;
import java.util.Scanner;
public class Harjutus25 {

	public static void main(String[] args) {
				File minuFail = new File("D:\\java\\ISK20Harjutused\\bin\\ISK20töö/students.csv");
				try {
					Scanner inputStream = new Scanner(minuFail);
					inputStream.next();
					while(inputStream.hasNext()){
						String data = inputStream.next();
						String[] values = data.split(",");

						System.out.println(values[0]);
					}
					inputStream.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
		}
	}

