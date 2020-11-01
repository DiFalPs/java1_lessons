package ru.geekbrains.j3.lesson_1;

public class Orange extends Fruit {
    Orange(Integer quantity, Float weight) {
        super(quantity, weight);
    }

    @Override
    float getWeight() {
        return 1.5f;
    }

    @Override
    float setWeight(Float weight) {
        return weight;
    }
}
