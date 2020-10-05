package ru.geekbrains.j2.lesson_3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Cat", "Dog", "Human", "Haas", "Gucci", "Nike", "Adidas", "Football", "SkyDiving", "AMG", "Formula1",
                "Renault", "Ferrari", "AlphaTauri", "Haas", "Williams", "AlphaRomeo", "RacingPoint", "Formula1", "AMG"); // AMG, Haas, Formula1 - povtor

        HashSet<String> eWords = new HashSet<String>(words);
        System.out.println(eWords.toString());
       for (String repeatWords : eWords) {
           System.out.println(repeatWords + " - " + Collections.frequency(words, repeatWords));
       }

    }
}
