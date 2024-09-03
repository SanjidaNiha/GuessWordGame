package com.fun.game;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Guess the Word Game!");
        WordGenerator generator = new WordGenerator();
        GameLogic game = new GameLogic(generator.getRandomWord());
        UserInput input = new UserInput();

        while (!game.isGameWon() && !game.isGameOver()) {
            System.out.println("\nCurrent Word: " + game.getMaskedWord());
            System.out.println("Guesses Left: " + game.getRemainingAttempts());
            char guess = input.getGuess();
            game.checkGuess(guess);
        }

        if (game.isGameWon()) {
            System.out.println("\nCongratulations! You guessed the word: " + game.getActualWord());
        } else {
            System.out.println("\nGame Over! The word was: " + game.getActualWord());
        }
    }
}
