package com.fun.game;

public class GameLogic {
    private String actualWord;
    private StringBuilder maskedWord;
    private int remainingAttempts;
    private boolean gameWon;

    public GameLogic(String word) {
        this.actualWord = word;
        this.maskedWord = new StringBuilder("_".repeat(word.length()));
        this.remainingAttempts = 6; // Number of wrong attempts allowed
        this.gameWon = false;
    }

    public void checkGuess(char guess) {
        boolean correctGuess = false;
        for (int i = 0; i < actualWord.length(); i++) {
            if (actualWord.charAt(i) == guess) {
                maskedWord.setCharAt(i, guess);
                correctGuess = true;
            }
        }
        if (!correctGuess) {
            remainingAttempts--;
        }
        if (maskedWord.toString().equals(actualWord)) {
            gameWon = true;
        }
    }

    public String getMaskedWord() {
        return maskedWord.toString();
    }

    public int getRemainingAttempts() {
        return remainingAttempts;
    }

    public boolean isGameWon() {
        return gameWon;
    }

    public boolean isGameOver() {
        return remainingAttempts <= 0;
    }

    public String getActualWord() {
        return actualWord;
    }
}
