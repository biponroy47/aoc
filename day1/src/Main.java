import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) throws FileNotFoundException {
		
//----------------------------------------------
// part 1		
//----------------------------------------------
//		int max = 0;
//		int temp = 0;
//		
//		File input = new File("input.txt");
//		Scanner reader =  new Scanner(input);
//		
//		while(reader.hasNextLine()) {
//			String line = reader.nextLine();
//			
//			if(line.equals("")) {
//				if(temp > max) max = temp;
//				temp = 0;
//			}
//			else temp += Integer.parseInt(line);
//		}
//		System.out.println(max);

//----------------------------------------------
// part 2		
//----------------------------------------------
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		File input = new File("input.txt");
		Scanner reader =  new Scanner(input);
		int temp = 0, total = 0;
		
		while(reader.hasNextLine()) {
			String line = reader.nextLine();

			if(line.equals("")) {
				nums.add(temp);
				temp = 0;
			}
			else temp += Integer.parseInt(line);
		}
		Collections.sort(nums);
		
		for(int i = 1; i < 4; i++) total += nums.get(nums.size() - i);
		System.out.println(total);
	}
}
