package ru.geekbrains.j2.lesson_2;

import java.util.Arrays;

public class Main {



    static int[][] intConverter(String[][] matrixCreator) {
        int[][] intArr = new int[matrixCreator.length][];
        int sum = 0;
            for (int i = 0; i < matrixCreator.length; i++) {
                intArr[i] = new int[matrixCreator.length];
                for (int j = 0; j < matrixCreator.length; j++) {
                    try {
                    intArr[i][j] = Integer.parseInt(matrixCreator[i][j]);
                        sum += intArr[i][j] / 2;
                        intArr[0][0] = sum;
                    } catch(NumberFormatException e){
                        System.out.println(e.getMessage() + " - данный символ должен быть типа int");
                    }

                }
            }
        return intArr;
    }
//    static int intConverter(String[][] matrixCreator) throws NumberFormatException {
//        int[][] intArr = new int[matrixCreator.length][];
//        int sum = 0;
//        for (int i = 0; i < matrixCreator.length; i++) {
//            intArr[i] = new int[matrixCreator.length];
//            for (int j = 0; j < matrixCreator.length; j++) {
//                try {
//                    intArr[i][j] = Integer.parseInt(matrixCreator[i][j]);
//                } catch(NumberFormatException e){
//                    System.out.println(e.getMessage() + " - данный символ должен быть типа int");
//                    System.exit(1);
//                }
//                sum += intArr[i][j] / 2;
//
//            }
//        }
//        return sum;
//    }

    static String[][] matrixCreator(String line) {
        String[] strArr1 = line.split("\n");
        String[][] matrix = new String[strArr1.length][];
        for (int i = 0; i < strArr1.length; i++) {
            matrix[i] = strArr1[i].split(" ");
        }
        return matrix;
    }



    public static void main(String[] args) {
	String strLine = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
	matrixCreator(strLine);
    intConverter(matrixCreator(strLine));
    


    }




}
