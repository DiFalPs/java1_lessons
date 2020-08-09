package ru.geekbrains.lesson_3;

public class Cat extends Animals {
    private final int MAX_METERS_RUN = 200;

    public Cat (String name, int age) {
        super(name, age);
    }

    @Override
    public void run(int metres) {
        for (int i = 1; i < metres; i++) {
            if (getUid() == i) {
                if (MAX_METERS_RUN + i * 10 > metres) {
                    System.out.println(this.name + " пробежал(а)" + metres + "м"); break;
                } else System.out.println(this.name + " не может пробежать такое расстояние"); break;
            }

        }
    }
    @Override
    public void swim(int metres) {
        System.out.println(this.name + " не умеет плавать");
    }

}
