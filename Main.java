package ru.geekbrains.j2.lesson_5;

import java.util.Arrays;

public class Main {
    static final int size = 1000000;
    static final int h = size / 2;

     public static void arrCreate1 () {
        float[] arr1 = new float[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = 1;
        }

        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a + " - время работы метода 1");
    }

    public static void arrCreate2 () {
        float[] arr2 = new float[size];
        for (int i = 0; i < size; i++) {
            arr2[i] = 1;
        }

        float[] newArr = new float[h];
        float[] newArr2 = new float[h];

        long razArr = System.currentTimeMillis();
        System.arraycopy(arr2, 0, newArr, 0, h);
        System.arraycopy(arr2, h, newArr2, 0, h);
        System.out.println(System.currentTimeMillis() - razArr + " - время разбивки массива на 2");

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                long scores2 = System.currentTimeMillis();
                for (int i = 0; i < h; i++) {
                    newArr[i] = (float)(newArr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.out.println(System.currentTimeMillis() - scores2 + " - время подсчёта в 1 массиве");
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                long scores2 = System.currentTimeMillis();
                for (int i = 0; i < h; i++) {
                    newArr2[i] = (float)(newArr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.out.println(System.currentTimeMillis() - scores2 + " - время подсчёта во 2 массиве");
            }
        };
        thread1.start();
        thread2.start();

        long obied = System.currentTimeMillis();
        System.arraycopy(newArr, 0, arr2, 0, h);
        System.arraycopy(newArr2, 0, arr2, h, h);
        System.out.println(System.currentTimeMillis() - obied + " - время объединения массивов");


    }
    public static void main(String[] args) {
        Main.arrCreate1();
        Main.arrCreate2();

    }
}
