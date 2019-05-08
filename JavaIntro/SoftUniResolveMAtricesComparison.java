package _arrays_1_compare_matrices;

import java.util.Arrays;
import java.util.Scanner;

public class SoftUniResolveMAtricesComparison {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] dimentions = Arrays.stream(scanner.nextLine().split("\\s++"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firtMatrixRows = dimentions[0];
        int firstMatrixCols = dimentions[1];

        int [][] firstMatrix = new int[firtMatrixRows][];


        for (int i = 0; i < firtMatrixRows; i++) {
            int [] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
//1     2 3
        firstMatrix[i] = arr;

        }

        dimentions = Arrays.stream(scanner.nextLine().split("\\s++"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int secondMatrixRows = dimentions[0];
        int secondtMatrixCols = dimentions[1];

        int [][] secondMatrix = new int[secondMatrixRows][];


        for (int i = 0; i < secondMatrixRows; i++) {
            int [] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            secondMatrix[i] = arr;

        }

        boolean isEqual = matricesAreEqual(firstMatrix, secondMatrix);
        //System.out.println(isEqual);
        if (isEqual){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }

    }

    private static boolean matricesAreEqual(int [][] firstMatrix, int [][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;

        }

        for (int row = 0; row < firstMatrix.length; row++) {
            if (firstMatrix[row].length != secondMatrix[row].length){
                return false;

        }
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]){
                    return  false;
                }
            }


        }
        return true;
    }
}
