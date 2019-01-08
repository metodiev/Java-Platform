package test.loops;

public class Arrays {
	
	public static void main(String[] args) {
		int[] numbers = { 1, 29, 3, 54 };

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		int[] numbersLong = { 105050, 250059, 32962, 5462 };

		for (int i : numbersLong) {
			System.out.println(i);
		}

		int[][] matrix = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
		// System.out.println("@@@@@@@" + matrix.length);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[1].length; j++) {
				System.out.println(matrix[i][j]);
			}
		}
		// home work play with matrix

		int[][][] matrixTripleDimension = { 
				{ { 1, 2, 3, 4 } }, 
				{ { 1, 2, 3, 4 } },
				{ { 1, 2, 3, 4 } } 
				};
		//System.out.println("@@@@@@@" + matrixTripleDimension[0].length);
		for (int row = 0; row < matrixTripleDimension.length; row++) {
			for (int col = 0; col < matrixTripleDimension[0].length; col++) {
				for (int z = 0; z < matrixTripleDimension[0][0].length; z++) {
					System.out.print(matrixTripleDimension[row][col][z]);
				}
				System.out.println();
			}
		}
	}

}
