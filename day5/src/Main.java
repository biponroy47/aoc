import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("input2.txt");
		Scanner reader = new Scanner(input);

		Stack<Character>[] stacks = new Stack[9];
		Stack<Character> tempStack = new Stack<Character>(); //only needed for part 2
		for (int i = 0; i < stacks.length; i++) stacks[i] = new Stack<Character>();
		
		String s1 = "HRBDZFLS";
		String s2 = "TBMZR";
		String s3 = "ZLCHNS";
		String s4 = "SCFJ";
		String s5 = "PGHWRZB";
		String s6 = "VJZGDNMT";
		String s7 = "GLNWFSPQ";
		String s8 = "MZR";
		String s9 = "MCLGVRT";

		for(int i = 0; i < s1.length(); i++) stacks[0].push(s1.charAt(i));
		for(int i = 0; i < s2.length(); i++) stacks[1].push(s2.charAt(i));
		for(int i = 0; i < s3.length(); i++) stacks[2].push(s3.charAt(i));
		for(int i = 0; i < s4.length(); i++) stacks[3].push(s4.charAt(i));
		for(int i = 0; i < s5.length(); i++) stacks[4].push(s5.charAt(i));
		for(int i = 0; i < s6.length(); i++) stacks[5].push(s6.charAt(i));
		for(int i = 0; i < s7.length(); i++) stacks[6].push(s7.charAt(i));
		for(int i = 0; i < s8.length(); i++) stacks[7].push(s8.charAt(i));
		for(int i = 0; i < s9.length(); i++) stacks[8].push(s9.charAt(i));
		
		while (reader.hasNextLine()) {
			String[] inputs = reader.nextLine().split(" ");
			int count = Integer.parseInt(inputs[1]);
			int moveFrom = Integer.parseInt(inputs[3]) - 1;
			int moveTo = Integer.parseInt(inputs[5]) - 1;
			
//			part 1
//			for(int i = 0; i < count; i++) {
//				stacks[moveTo].push(stacks[moveFrom].pop());
//			}
			
//			part 2 
			if (count == 1) stacks[moveTo].push(stacks[moveFrom].pop());
			else {
				for (int i = 0; i < count; i++) tempStack.push(stacks[moveFrom].pop());
				for (int i = 0; i < count; i++) stacks[moveTo].push(tempStack.pop());
			}
		}
		for (int i = 0; i < stacks.length; i++) System.out.print(stacks[i].peek());
	}
}