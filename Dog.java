package ru.geekbrains.lesson_3;

public class Dog extends Animals{
    private final int MAX_METERS_RUN = 500;
    private final float MAX_JUMP_HEIGHT = 0.5f;
    public Dog (String name, int age) {
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
    public void jump(float height) {
        if (height > MAX_JUMP_HEIGHT) {
            System.out.println(this.name + " не может перепрыгнуть такую высоту");
        } else {
            System.out.println(this.name + " перепрыгнул(а) " + height+ " м");
        }
    }
}
