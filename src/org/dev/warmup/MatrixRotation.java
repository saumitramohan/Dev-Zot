package org.dev.warmup;

public class MatrixRotation {

	public static boolean rotate(int[][] matrix) {
		if (matrix.length == 0 && matrix[0].length == 0) {
			return false;
		}
		int n = matrix.length;
		for (int layer = 0; layer < n / 2; layer++) {
			
			int first = layer;
			int last = n - 1 - layer;

			for (int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[last - offset][first];
				matrix[last - offset][first] = matrix[i][last];
				matrix[i][last] = top;
			}

		}

		return true;
	}

}
