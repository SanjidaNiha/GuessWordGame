package com.fun.game;

import java.util.Random;

public class WordGenerator {
    private String[] words = {"apple", "banana", "cherry", "grape", "orange", "mango"};

    public String getRandomWord() {
        Random random = new Random();
        int index = random.nextInt(words.length);
        return words[index];
    }
}
