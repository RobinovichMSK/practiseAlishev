package org.example.battleShip;

public class Ship {
    private String shipName;
    private int size;
    private int shipLife;
    private boolean isDead;
    private Position position;

    public Ship(String shipName, int size) {
        this.shipName = shipName;
        this.size = size;
        this.shipLife = size;
        this.isDead = false;
    }

    public String getShipName() {
        return shipName;
    }

    public int getSize() {
        return size;
    }

    public int getShipLife() {
        return shipLife;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void shipWasHit() {
        if(shipLife == 0) {
            isDead = true;
            System.out.println("Вы потопили " + shipName);
            return;
        }
        shipLife--;
    }

}
