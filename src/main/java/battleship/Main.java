package battleship;

import battleship.boardLogic.Board;
import battleship.gameLogic.Game;
import battleship.playerLogic.HumanPlayer;
import battleship.playerLogic.Player;

import static battleship.boardLogic.BoardBuilder.buildRandomBoard;

public class Main {

    public static void main(String[] args) {
        int[] ships = new int[]{2, 3, 3, 4, 5};

        Board b1 = buildRandomBoard(ships, 8, 8);
        Board b2 = buildRandomBoard(ships, 8, 8);

        Player p1 = new HumanPlayer("Player 1");
        Player p2 = new HumanPlayer("Player 2");

        Game game = new Game(p1, p2, b1, b2);
        game.play();
    }
}
