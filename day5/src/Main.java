import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static Stack<Character> tempStack = new Stack<Character>();

	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("input2.txt");
		Scanner reader = new Scanner(input);

//		Stack<Character>[] stacks = new Stack [3];
//		stacks[0] = new Stack<Character>();
//		stacks[1] = new Stack<Character>();
//		stacks[2] = new Stack<Character>();
//
//		stacks[0].push('Z');
//		stacks[0].push('N');
//		
//		stacks[1].push('M');
//		stacks[1].push('C');
//		stacks[1].push('D');
//
//		stacks[2].push('P');
//		
//		while(reader.hasNextLine()) {
//			String [] inputs = reader.nextLine().split(" ");
//			int count = Integer.parseInt(inputs[1]);
//			int moveFrom = Integer.parseInt(inputs[3]) - 1;
//			int moveTo = Integer.parseInt(inputs[5]) - 1;
//			
//			for(int i = 0; i < count; i++) {
//				stacks[moveTo].push(stacks[moveFrom].pop());
//			}
//			
//		}
//		
//		for(int i = 0; i < stacks.length; i++) {
//			System.out.print(stacks[i].peek());
//		}

		Stack<Character>[] stacks = new Stack[9];
		for (int i = 0; i < stacks.length; i++)
			stacks[i] = new Stack<Character>();

		stacks[0].push('H');
		stacks[0].push('R');
		stacks[0].push('B');
		stacks[0].push('D');
		stacks[0].push('Z');
		stacks[0].push('F');
		stacks[0].push('L');
		stacks[0].push('S');

		stacks[1].push('T');
		stacks[1].push('B');
		stacks[1].push('M');
		stacks[1].push('Z');
		stacks[1].push('R');

		stacks[2].push('Z');
		stacks[2].push('L');
		stacks[2].push('C');
		stacks[2].push('H');
		stacks[2].push('N');
		stacks[2].push('S');

		stacks[3].push('S');
		stacks[3].push('C');
		stacks[3].push('F');
		stacks[3].push('J');

		stacks[4].push('P');
		stacks[4].push('G');
		stacks[4].push('H');
		stacks[4].push('W');
		stacks[4].push('R');
		stacks[4].push('Z');
		stacks[4].push('B');

		stacks[5].push('V');
		stacks[5].push('J');
		stacks[5].push('Z');
		stacks[5].push('G');
		stacks[5].push('D');
		stacks[5].push('N');
		stacks[5].push('M');
		stacks[5].push('T');

		stacks[6].push('G');
		stacks[6].push('L');
		stacks[6].push('N');
		stacks[6].push('W');
		stacks[6].push('F');
		stacks[6].push('S');
		stacks[6].push('P');
		stacks[6].push('Q');

		stacks[7].push('M');
		stacks[7].push('Z');
		stacks[7].push('R');

		stacks[8].push('M');
		stacks[8].push('C');
		stacks[8].push('L');
		stacks[8].push('G');
		stacks[8].push('V');
		stacks[8].push('R');
		stacks[8].push('T');
		
		

		while (reader.hasNextLine()) {
			String[] inputs = reader.nextLine().split(" ");
			int count = Integer.parseInt(inputs[1]);
			int moveFrom = Integer.parseInt(inputs[3]) - 1;
			int moveTo = Integer.parseInt(inputs[5]) - 1;
			

			if (count == 1)
				stacks[moveTo].push(stacks[moveFrom].pop());
			else {
				for (int i = 0; i < count; i++) {
					tempStack.push(stacks[moveFrom].pop());
				}
				for (int i = 0; i < count; i++) {
				stacks[moveTo].push(tempStack.pop());
				}
			}
		}

		for (int i = 0; i < stacks.length; i++) {
			System.out.print(stacks[i].peek());
		}
	}
}