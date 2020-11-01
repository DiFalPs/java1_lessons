package ru.geekbrains.j3.lesson_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void chooseTwoArrayValue() {   //конечно, ещё бы проверочки сделать, но не хватает времени
        //Конечно, просили ссылочный массив и там код был бы из 27, 30, 31 строки, только в 27 я написал бы Объект, но я ещё попробовал сделать таким путём и он оказался поинтереснее
        int[] arr = {10,2,33,21,8};
        System.out.println(Arrays.toString(arr));
        System.out.println("Выбирете 1-е число");
////        Scanner scanner = new Scanner(System.in);
////        int a = scanner.nextInt();
////        System.out.println("Выберите 2-е число, c которым хотите поменять его местами");
////        int b = scanner.nextInt();
//        swapPlaces(a, b, arr);
        refractorArrayToArrayList(arr);
    }

    public static void swapPlaces (int a, int b, int[] array) {
        int[] swapArray  = array;
        for (int i = 0; i < array.length; i++){
            if (array[i] == a) {
                int forSwap = swapArray[i];
                for (int j = 0; j < array.length; j++){
                    if (array[j] == b) {
                        swapArray[i] = swapArray[j];
                        swapArray[j] = forSwap;
                        break;
                    }
                } break;
            }
        }
        System.out.println(Arrays.toString(swapArray));
    }


    public static void refractorArrayToArrayList (int[] array) {
        Integer [] integerArray = IntStream.of(array).boxed().toArray(Integer []::new); //нашёл, этот код преобразования int в Integer, но не смог найти как это работает, не могли бы объяснить?
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(integerArray));

    }

    public static void main(String[] args) {
        chooseTwoArrayValue();
        Fruit fruit = new Fruit(10, 1.0f);
        System.out.println(fruit.getWeight());





    }
}
