import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("input2.txt");
		Scanner reader = new Scanner(input);
//----------------------------------------------
// part 1		
//----------------------------------------------
//		int total = 0;
//
//		while (reader.hasNextLine()) {
//			String line = reader.nextLine();
//			String[] temp = line.split(",");
//			String assign1 = temp[0];
//			String assign2 = temp[1];
//
//			String[] a = assign1.split("-");
//			String[] b = assign2.split("-");
//
//			int aLow = Integer.parseInt(a[0]);
//			int aHigh = Integer.parseInt(a[1]);
//			int bLow = Integer.parseInt(b[0]);
//			int bHigh = Integer.parseInt(b[1]);
//
//			if (aLow >= bLow && aHigh <= bHigh)
//				total += 1;
//			else if (bLow >= aLow && bHigh <= aHigh)
//				total += 1;
//		}
//		System.out.println(total);
//----------------------------------------------
// part 2		
//----------------------------------------------
		int total = 0;

		while (reader.hasNextLine()) {
			ArrayList<Integer> nums = new ArrayList<Integer>();

			String line = reader.nextLine();
			String[] temp = line.split(",");
			String assign1 = temp[0];
			String assign2 = temp[1];

			String[] a = assign1.split("-");
			String[] b = assign2.split("-");

			int aLow = Integer.parseInt(a[0]);
			int aHigh = Integer.parseInt(a[1]);
			int bLow = Integer.parseInt(b[0]);
			int bHigh = Integer.parseInt(b[1]);

			for (int i = aLow; i <= aHigh; i++) nums.add(i);
			for (int i = bLow; i <= bHigh; i++) {
				if (nums.contains(i)) {
					total += 1;
					break;
				} else nums.add(i);
			}
		}
		System.out.println(total);
	}
}
