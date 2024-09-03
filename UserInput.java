package com.fun.game;

import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    public char getGuess() {
        System.out.print("Enter a letter: ");
        String input = scanner.nextLine();
        return input.length() > 0 ? input.charAt(0) : ' ';
    }
}
