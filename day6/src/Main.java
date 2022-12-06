import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("input2.txt");
		Scanner reader = new Scanner(input);
		String[] chars = reader.nextLine().split("");
		
		search: for (int i = 0; i < chars.length; i++) {
			HashSet<String> list = new HashSet<String>();
			for (int j = i; j < (i + 14); j++) list.add(chars[j]);
			if (list.size() == 14) {
				System.out.println(i + 14);
				break search;
			}
		}
	}
}