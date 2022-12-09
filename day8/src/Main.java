import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("input2.txt");
		Scanner reader = new Scanner(input);

		ArrayList<String> list = new ArrayList<String>();
		int rows = 0;

		while (reader.hasNextLine()) {
			list.add(reader.nextLine());
			rows++;
		}

		int cols = list.get(0).length();
		int[][] grid = new int[rows][cols];
		boolean[][] bools = new boolean[rows][cols];

		for (int i = 0; i < rows; i++) {
			String[] temp = list.get(i).split("");
			for (int j = 0; j < cols; j++) {
				grid[i][j] = Integer.parseInt(temp[j]);
				bools[i][j] = true;
			}
		}
		int total = rows * cols;
		
		for (int i = 1; i < rows - 1; i++) {
			for (int j = 1; j < cols - 1; j++) {
				if(!visible(grid, i, j, grid[i][j])) {
					bools[i][j] = false;
					total--;
				}
			}
		}
		System.out.println(total);
//		for (int[] row : grid) System.out.println(Arrays.toString(row));
//		for (boolean[] row : bools) System.out.println(Arrays.toString(row));
	}

	public static boolean visible(int[][] grid, int row, int col, int cur) {
		boolean left = true, right = true, top = true, bottom = true;

		for (int i = col - 1; i >= 0; i--) if (grid[row][i] >= cur) left = false;
		for (int i = col + 1; i < grid[row].length; i++) if (grid[row][i] >= cur) right = false;
		for (int i = row - 1; i >= 0; i--) if (grid[i][col] >= cur) top = false;
		for (int i = row + 1; i < grid.length; i++) if (grid[i][col] >= cur) bottom = false;
		
		if(left || right || top || bottom) return true;
		else return false;
	}
}
