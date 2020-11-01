package ru.geekbrains.j3.lesson_1;

public class Apple extends Fruit{

    Apple(Integer quantity, Float weight) {
        super(quantity, weight);
    }

    @Override
    float getWeight() {
        return 1.0f;
    }

    @Override
    float setWeight(Float weight) {
        return weight;
    }
}


