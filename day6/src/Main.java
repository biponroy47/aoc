import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("input2.txt");
		Scanner reader = new Scanner(input);
		String[] chars = reader.nextLine().split("");

		search: for (int i = 0; i < chars.length; i++) {
			ArrayList<String> list = new ArrayList<String>();
			for(int j = i; j < (i + 14); j++) {
				if (!list.contains(chars[j])) list.add(chars[j]);
			}
			if (list.size() == 14) {
				System.out.println(i + 14);
				break search;
			}
//			part 1
//			if (!list.contains(chars[i])) list.add(chars[i]);
//			if (!list.contains(chars[i + 1])) list.add(chars[i + 1]);
//			if (!list.contains(chars[i + 2])) list.add(chars[i + 2]);
//			if (!list.contains(chars[i + 3])) list.add(chars[i + 3]);
//			if (list.size() == 4) {
//				System.out.println(i + 4);
//				break search;
//			}
		}
	}
}