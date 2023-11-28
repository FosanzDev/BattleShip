package com.fosanzdev.battleship.playerLogic;

import com.fosanzdev.battleship.gameLogic.Hit;

import java.util.Scanner;

public class HumanPlayer implements BSPlayer {

    public HumanPlayer(){

    }

    public Hit play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates to hit: ");
        String input = scanner.nextLine();
        String[] coordinates = input.split(" ");
        int x = Integer.parseInt(coordinates[0]);
        int y = Integer.parseInt(coordinates[1]);
        return new Hit(x, y);
    }
}
