package ru.geekbrains.lesson_3;

public abstract class Animals {
    private static int id = 1;
    private int uid;
    protected String name;
    protected int age;

    protected Animals(String name, int age) {
        this.name = name;
        this.age = age;
        this.uid = id++;
    }

    protected abstract void run(int metres);

    protected void swim(int metres) {
        if (metres > 10) {
            System.out.println(this.name + " не может проплыть такое расстояние");
        } else {
            System.out.println(this.name + " проплыл(а) " + metres + " м");
        }
    }

    protected void jump(float height) {
        if (height > 2) {
            System.out.println(this.name + " не может перепрыгнуть такую высоту");
        } else {
            System.out.println(this.name + " перепрыгнул(а) " + height + " м");
        }
    }

    public int getUid(){
        return this.uid;
    }

}
