package battleship.playerLogic;

import battleship.gameLogic.Hit;

public abstract class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Hit getHit();

}