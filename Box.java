package ru.geekbrains.j3.lesson_1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Box <T extends Fruit> {
    private T fruits;
    private ArrayList<T> boxFruit = new ArrayList<>();

    public Box() {
    }

    public float getWeight() {
        float weight = 0.0f;
        for(T sample : boxFruit){
            weight += sample.getWeight();
        }
        return weight;
    }

    boolean compare(Box otherBox) {
        if(getWeight() == otherBox.getWeight()) {
            return true;
        } else return false;
    }

    public void pourTo(Box <T> otherBox){
        otherBox.boxFruit.addAll(boxFruit);
        boxFruit.clear();
    }





}