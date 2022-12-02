import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
//----------------------------------------------
// part 1		
//----------------------------------------------
//		File input = new File("input2.txt");
//		Scanner reader =  new Scanner(input);
//		
//		int points = 0;
//		
//		while(reader.hasNextLine()) {
//			String line = reader.nextLine();
//
//			if(line.charAt(0) == 'A' && line.charAt(2) == 'X') points += 4; //r v r 1 3 = 4
//			if(line.charAt(0) == 'A' && line.charAt(2) == 'Y') points += 8; //r v p 2 6 = 8
//			if(line.charAt(0) == 'A' && line.charAt(2) == 'Z') points += 3; //r v s 3 0 = 3
//			if(line.charAt(0) == 'B' && line.charAt(2) == 'X') points += 1; //p v r 1 0 = 1
//			if(line.charAt(0) == 'B' && line.charAt(2) == 'Y') points += 5; //p v p 2 3 = 5
//			if(line.charAt(0) == 'B' && line.charAt(2) == 'Z') points += 9; //p v s 3 6 = 9
//			if(line.charAt(0) == 'C' && line.charAt(2) == 'X') points += 7; //s v r 1 6 = 7
//			if(line.charAt(0) == 'C' && line.charAt(2) == 'Y') points += 2; //s v p 2 0 = 2
//			if(line.charAt(0) == 'C' && line.charAt(2) == 'Z') points += 6; //s v s 3 3 = 6
//		}
//		System.out.println(points);
//----------------------------------------------
// part 1		
//----------------------------------------------
		File input = new File("input2.txt");
		Scanner reader =  new Scanner(input);
		int points = 0;
		
		while(reader.hasNextLine()) {
			String line = reader.nextLine();
			
			if(line.charAt(0) == 'A' && line.charAt(2) == 'X') points += 3; //r v s l 3 0 = 3
			if(line.charAt(0) == 'A' && line.charAt(2) == 'Y') points += 4; //r v r d 1 3 = 4
			if(line.charAt(0) == 'A' && line.charAt(2) == 'Z') points += 8; //r v p w 2 6 = 8
			if(line.charAt(0) == 'B' && line.charAt(2) == 'X') points += 1; //p v r l 1 0 = 1
			if(line.charAt(0) == 'B' && line.charAt(2) == 'Y') points += 5; //p v p d 2 3 = 5
			if(line.charAt(0) == 'B' && line.charAt(2) == 'Z') points += 9; //p v s w 3 6 = 9
			if(line.charAt(0) == 'C' && line.charAt(2) == 'X') points += 2; //s v p l 2 0 = 2
			if(line.charAt(0) == 'C' && line.charAt(2) == 'Y') points += 6; //s v s d 3 3 = 6
			if(line.charAt(0) == 'C' && line.charAt(2) == 'Z') points += 7; //s v r w 1 6 = 7
		}
		System.out.println(points);
	}
}
