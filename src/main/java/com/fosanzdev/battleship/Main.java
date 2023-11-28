package com.fosanzdev.battleship;

import com.fosanzdev.battleship.boardLogic.Board;
import com.fosanzdev.battleship.gameLogic.Game;
import com.fosanzdev.battleship.playerLogic.HumanPlayer;
import com.fosanzdev.battleship.playerLogic.BSPlayer;

import static com.fosanzdev.battleship.boardLogic.BoardBuilder.buildRandomBoard;

public class Main {

    public static void main(String[] args) {
        int[] ships = new int[]{2, 3, 3, 4, 5};

        Board b1 = buildRandomBoard(ships, 8, 8);
        Board b2 = buildRandomBoard(ships, 8, 8);

        BSPlayer p1 = new HumanPlayer();
        BSPlayer p2 = new HumanPlayer();

        Game game = new Game(p1, p2, b1, b2);
        game.play();
    }
}
