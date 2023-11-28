package com.fosanzdev.battleship.gameLogic;

import com.fosanzdev.battleship.boardLogic.Board;
import com.fosanzdev.battleship.boardLogic.BoardBuilder;
import com.fosanzdev.battleship.playerLogic.BSPlayer;

public class Game {

    private static final int BOARD_SIZE = 8;
    private static final int[] SHIPS = new int[] {2, 3, 3, 4, 5};

    private Board board1;
    private Board board2;

    private BSPlayer player1;
    private BSPlayer player2;

    public Game(BSPlayer player1, BSPlayer player2) {
        this.player1 = player1;
        this.player2 = player2;

        board1 = BoardBuilder.buildRandomBoard(SHIPS, BOARD_SIZE, BOARD_SIZE);
        board2 = BoardBuilder.buildRandomBoard(SHIPS, BOARD_SIZE, BOARD_SIZE);
    }

    public Game(BSPlayer player1, BSPlayer player2, Board board1, Board board2) {
        this.board1 = board1;
        this.board2 = board2;
    }

    public void play() {
        //Turn defines which one is playing
        //If it's true, player1 is playing
        boolean turn = true;
        //allSunk defines if all ships are sunk
        boolean allSunk = false;
        while (!allSunk){
            //If it's player1 turn, player1 hits player2 board
            if (turn){
                System.out.println("Player 1 turn");
                //Get hit from player1
                Hit hit = player1.play();
                //Hit player2 board
                board2.hit(hit);
                //Check if all ships are sunk
                allSunk = board2.allSunk();
                //Change turn
                turn = false;
            }
            else {
                System.out.println("Player 2 turn");
                Hit hit = player2.play();
                board1.hit(hit);
                allSunk = board1.allSunk();
                turn = true;
            }

            System.out.println("Player 1 board");
            board1.printBoard();
            System.out.println("Player 2 board");
            board2.printBoard();
        }

        if (turn){
            System.out.println("Player 1 won!");
        }
        else {
            System.out.println("Player 2 won!");
        }
    }

}
