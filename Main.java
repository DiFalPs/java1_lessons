package ru.geekbrains.jalgoritmi.lessons;

/*1. Описать простейшие алгоритмы
        1.1. Возведение в степень *используя чётность степени*
        1.2. Поиск минимального элемента в массиве
        1.3. Нахождение среднего арифметического массива
        2. Подсчитать сложность описанных алгоритмов
        3. Какие правила подсчёта применялись, оставьте комментарии в коде **
 */

public class Main {

    public static void exponentiation (int value, int raisedToThePowerOf) {    //в данном примере O(5 + 1) т.к. rTTPO = 5; O(n + k)
        int a = 1;
        for(int i = 0; i < raisedToThePowerOf; i++) {
            a *= value;
        }
    }

    public static void findMinValue (int[] arr) { //Тут O(11 + 1) т.к. массив состоит из 11 элемментов
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]< min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void findAvarage (int[] arr) { //О(3 + 3) т.к. массив из 3 эл и 3 простых действия
        double avg = 0;
        double sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }
        avg = sum / arr.length;

        System.out.println(avg);
    }


    public static void main(String[] args) {
        exponentiation(2, 5);
        int[] arr = {11,2,3,4,5,12,13, -5,123,543,523};
        findMinValue(arr);
        int[] arrAvg = {2,5,5};
        findAvarage(arrAvg);

    }
}
