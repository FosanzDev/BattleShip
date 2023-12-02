package com.fosanzdev.battleship.shipLogic;

public class ShipPart {

    private boolean hit = false;
    private VShip ship;
    private int shipIndex;

    public ShipPart(VShip ship, int shipIndex) {
        this.ship = ship;
        this.shipIndex = shipIndex;
    }

    public boolean isHit() {
        return hit;
    }

    public void hit() {
        hit = true;
        ship.notifyHit();
    }

    public VShip getShip() {
        return ship;
    }

    public int getShipIndex() {
        return shipIndex;
    }
}
