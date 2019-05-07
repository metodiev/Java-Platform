package _arrays_1_compare_matrices;

import java.util.Scanner;

public class CompareMatrices {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String rowColsNumbers = input.nextLine();
        String[] rowColNum = rowColsNumbers.split(" ");

        int rowNumbers = Integer.valueOf(rowColNum[0]);
        int colNumbers = Integer.valueOf(rowColNum[1]);

        int matrix[][] = new int[rowNumbers][colNumbers];

        //rows
        //[matrix[0].length will get the columns size
        String[] strings = new String[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            strings[i] = input.nextLine();
        }


        for (int i = 0; i < matrix.length; i++) {
            String[] tmp = strings[i].split(" ");

            for (int j = 0; j < matrix[0].length; j++) {

                //System.out.println(matrix[0].length);
                matrix[i][j] = Integer.valueOf(tmp[j]);
            }
        }

        String rowColsNumbers1 = input.nextLine();
        String[] rowColNum1 = rowColsNumbers1.split(" ");

        int rowNumbers1 = Integer.valueOf(rowColNum1[0]);
        int colNumbers1 = Integer.valueOf(rowColNum1[1]);

        int matrix2[][] = new int[rowNumbers1 ][colNumbers1 ];

        String[] strings2 = new String[matrix2.length];

        for (int i = 0; i < matrix2.length; i++) {
            strings2[i] = input.nextLine();
        }


        for (int i = 0; i < matrix2.length; i++) {
            String[] tmp = strings2[i].split(" ");

            for (int j = 0; j < matrix2[0].length ; j++) {

                //System.out.println(matrix[0].length);
                matrix2[i][j] = Integer.valueOf(tmp[j]);
            }
        }
//        for (int i = 0; i < matrix2.length; i++) {
//            for (int j = 0; j < matrix2[0].length; j++) {
//
//                //System.out.println(matrix[0].length);
//                System.out.print(matrix2[i][j] + " ");
//            }
//            System.out.println();
//        }

        String isEqual = compareTwoDimentionalArrays(matrix, matrix2);
        System.out.println(isEqual);
    }

    private static String compareTwoDimentionalArrays(int[][] matrix, int[][] matrix2) {
        if (matrix.length == matrix2.length &&
                matrix[0].length == matrix2[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] != matrix2[i][j]) {
                        return "not equal";

                    } else {
                        return "equal";
                    }


                }
            }
        }
            return "not equal";

    }

}
