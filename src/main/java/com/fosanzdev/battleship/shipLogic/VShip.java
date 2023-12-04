package com.fosanzdev.battleship.shipLogic;

import com.fosanzdev.battleship.gameLogic.Hit;

public class VShip{
    private final int area;
    private boolean sunk = false;
    private final ShipPart[] parts;
    private final Hit[] hits;
    private final Orientation orientation;
    public VShip(int area, Orientation orientation) {
        this.area = area;
        this.parts = new ShipPart[area];
        this.hits = new Hit[area];
        for (int i = 0; i < area; i++) {
            this.parts[i] = new ShipPart(this, i);
        }
        this.orientation = orientation;
    }

    public int getArea() {
        return area;
    }

    public boolean isSunk() {
        return sunk;
    }

    public void notifyHit() {
        for (int i = 0; i < area; i++) {
            if (!parts[i].isHit()) {
                return;
            }
        }
        System.out.println("Ship sunk");
        sunk = true;
    }

    public void addHit(int x, int y, int pos){
        hits[pos] = new Hit(x, y);
    }

    public Hit[] getHits(){
        return hits;
    }

    public ShipPart getShipPart(int i) {
        return parts[i];
    }

    public Orientation getOrientation() {
        return orientation;
    }
}
