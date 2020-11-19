package lesson6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static int[] addArrayWithNumberFour (int[] arr){
        String str = Arrays.toString(arr);
        if (str.indexOf(String.valueOf(4)) != -1) {
            int[] array = arr;
            int markerForFound_4 = 0;
            for (int i = 0; i < arr.length; i++) {
                if (array[i] == 4) {
                    markerForFound_4 = i;
                }
            }
            int[] copyArr = new int[array.length - markerForFound_4 - 1];
            System.arraycopy(array, markerForFound_4 + 1, copyArr, 0, copyArr.length);
            System.out.print(Arrays.toString(copyArr));
            return copyArr;
        } else throw new RuntimeException("В массиве не содержится цифра 4");


    }

    public static boolean tOrFIfArrHave1And2(int[] arr) {
        String str = Arrays.toString(arr);
        if (str.indexOf(String.valueOf(4)) != -1 && str.indexOf(String.valueOf(1)) != -1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 4 || arr[i] == 1) return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
    }
}
