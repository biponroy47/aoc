import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
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

		for (int i = 0; i < rows; i++) {
			String[] temp = list.get(i).split("");
			for (int j = 0; j < cols; j++) grid[i][j] = Integer.parseInt(temp[j]);
		}
		int score = 0;
		
		for (int i = 1; i < rows - 1; i++) {
			for (int j = 1; j < cols - 1; j++) {
				if(scenicScore(grid, i, j, grid[i][j]) > score) score = scenicScore(grid, i, j, grid[i][j]);
			}
		}
		System.out.println(score);
	}

	public static int scenicScore(int[][] grid, int row, int col, int cur) {
		int left = 0, right = 0, top = 0, bottom = 0;

		for (int i = col - 1; i >= 0; i--) {
			if (grid[row][i] >= cur) {
				left++;
				break;
			}
			else left++;
		}
		for (int i = col + 1; i < grid[row].length; i++) {
			if (grid[row][i] >= cur) {
				right++;
				break;
			}
			else right++;
		}
		for (int i = row - 1; i >= 0; i--) {
			if (grid[i][col] >= cur) {
				top++;
				break;
			}
			else top++;
		}
		for (int i = row + 1; i < grid.length; i++) {
			if (grid[i][col] >= cur) {
				bottom++;
				break;
			}
			else bottom++;
		}
		return left * right * top * bottom;
	}
}
