package ru.geekbrains.lesson_3;

public class Main1 {



    public static void main (String[] args) {

        Cat c1 = new Cat("Barsik", 2);
        Cat c2 = new Cat("Murzik", 7);
        Dog d1 = new Dog("Reks", 5);
        Dog d2 = new Dog("Raida", 9);

        Animals[] a1 = {c1, c2, d1, d2};
        for (int i = 0; i < a1.length; i++) {
            a1[i].run(520);
            a1[i].swim(10);
            a1[i].jump(1f);
        }

    }


}
