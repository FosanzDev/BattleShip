package battleship.boardLogic;

import battleship.shipLogic.Orientation;
import battleship.shipLogic.VShip;

public class BoardBuilder {

    private static final int MAX_ITERATIONS = 1000;

    public static Board buildRandomBoard(int[] ships, int sizeX, int sizeY) {
        Board board = new Board(sizeX, sizeY);
        for (int area : ships) {
            boolean placed = false;
            int iterations = 0;
            while (!placed && iterations < MAX_ITERATIONS) {
                //Random coordinates and orientation
                int x = (int) (Math.random() * 10);
                int y = (int) (Math.random() * 10);
                Orientation orientation = Orientation.values()[(int) (Math.random() * 4)];

                //Create ship and try to place it
                VShip vShip = new VShip(area, orientation);
                placed = board.addShip(vShip, x, y);

                iterations++;
                //If it's not placed, try again
                if (iterations == MAX_ITERATIONS) {
                    throw new RuntimeException("Could not place all ships in board");
                }
            }
        }
        return board;
    }
}
