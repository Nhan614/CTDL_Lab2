package task1;


public class Task1_3 {
	public static void printPascalTriangle(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < row - i; j++) {
				System.out.print(" ");
			}
			int[] currentRow = getPascalTriangle(i);
			for (int num : currentRow) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

	public static int[] getPascalTriangle(int n) {
		if (n == 1) {
			return new int[0];
		} else {
			int[] prevRow = getPascalTriangle(n - 1);
			return generateNextRow(prevRow);
		}
	}

	
	public static int[] generateNextRow(int[] prevRow) {
		int[] result = new int[prevRow.length + 1];
		result[0] = 1;
		result[result.length - 1] = 1;
		for (int i = 1; i < result.length - 1; i++) {
			result[i] = prevRow[i - 1] + prevRow[i];
		}
		return result;
	}

	public static void main(String[] args) {
		printPascalTriangle(5);
	}

}
