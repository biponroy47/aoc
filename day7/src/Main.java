import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("input2.txt");
		Scanner reader = new Scanner(input);
		
		Node root = new Node(null, "/", 0);
		Node currentNode = root;
		Tree tree = new Tree(root);
		ArrayList<Node> folders = new ArrayList<Node>();
		
		while(reader.hasNextLine()) {
			String [] inputs = reader.nextLine().split(" ");
			if(inputs.length == 3) {
				if(inputs[1].equals("cd") && inputs[2].equals("..")){
					currentNode = currentNode.getParent();
				}
				else if(inputs[1].equals("cd") && inputs[2].equals("/")){
					currentNode = root;
				}
				else currentNode = tree.findNode(currentNode, inputs[2]);
			}
			else if(inputs.length == 2) {
				if(inputs[0].equals("dir")) {
					Node newChild = new Node(currentNode, inputs[1], 0);
					currentNode.addChild(newChild);
					folders.add(newChild);
				}
				else if(inputs[1].equals("ls")) {
					continue;
				}
				else {
					Node newChild = new Node(currentNode, inputs[1], Integer.parseInt(inputs[0]));
					currentNode.addChild(newChild);
				}
			}
		}
		tree.calculateSizes(root);
		
//		PART 1
//		int output = 0; 
//		for(int i = 0; i < folders.size(); i++) {
//			if(folders.get(i).getSize() <= 100000) output += folders.get(i).getSize();
//		}
//		System.out.println(output);
		
		int [] sizes = new int [folders.size()];
		for(int i = 0; i < folders.size(); i++) sizes[i] = folders.get(i).getSize();
		
		Arrays.sort(sizes);
		int space = 70000000 - root.getSize();

		for(int i = 0; i < sizes.length; i++) {
			if(space + sizes[i] >= 30000000) {
				System.out.println(sizes[i]);
				break;
			}
		}
		
	}
}