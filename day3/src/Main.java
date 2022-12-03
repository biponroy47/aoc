import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

//----------------------------------------------
// part 1		
//----------------------------------------------
//		File input = new File("input2.txt");
//		Scanner reader = new Scanner(input);
//		int sum = 0;
//
//		int[] uppercasePrio = { 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52 };
//		int[] lowercasePrio = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26 };
//
//		while(reader.hasNextLine()) {
//			String line = reader.nextLine();
//			String comp1 = line.substring(0, line.length() / 2);
//			String comp2 = line.substring(line.length() / 2, line.length());
//			
//			search: for(int i = 0; i < comp1.length(); i++) {
//				char a = comp1.charAt(i);
//				for(int j = 0; j < comp2.length(); j++) {
//					char b = comp2.charAt(j);
//					
//					if(a == b && Character.isUpperCase(a) && Character.isUpperCase(b)){
//						sum += uppercasePrio[(int)a - 65];
//						break search;
//					}
//					else if(a == b && Character.isLowerCase(a) && Character.isLowerCase(b)){
//						sum += lowercasePrio[(int)a - 97];
//						break search;
//					}
//				}
//			}
//		}
//		System.out.println(sum);
//----------------------------------------------
// part 2		
//----------------------------------------------
		File input = new File("input2.txt");
		Scanner reader =  new Scanner(input);
		
		int sum = 0;
		
		int[] uppercasePrio = { 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52 };
		int[] lowercasePrio = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26 };

		while(reader.hasNextLine()) {
			String line1 = reader.nextLine();
			String line2 = reader.nextLine();;
			String line3 = reader.nextLine();
			
			search: for(int x = 0; x < line1.length(); x++) {
				for(int y = 0; y < line2.length(); y++) {
					for(int z = 0; z < line3.length(); z++) {
						char a = line1.charAt(x);
						char b = line2.charAt(y);
						char c = line3.charAt(z);
						
						if(a == b && b == c && Character.isUpperCase(a) && Character.isUpperCase(b) && Character.isUpperCase(c)) {
							sum += uppercasePrio[(int)a - 65];
							break search;
						}
						else if(a == b && b == c && Character.isLowerCase(a) && Character.isLowerCase(b) && Character.isLowerCase(c)) {
							sum += lowercasePrio[(int)a - 97];
							break search;
						}
					}
				}
			}
		}
		System.out.println(sum);
	}
}
