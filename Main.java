package ru.geekbrains.jalgorimts.lesson5;

public class Main {

    public static int valueInN (int value, int nValue) {
        int temp = 0;
        if (nValue == 1) return value;
        if (nValue != 1) {
            int returnNValue = value * valueInN(value, nValue - 1);
            temp = returnNValue;
        }
        return temp;
    }
    
    public static void main(String[] args){
        System.out.println(valueInN(2,7));
    }
}
