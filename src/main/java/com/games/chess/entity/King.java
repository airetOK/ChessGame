package com.games.chess.entity;

public class King extends Chessman {

    public King(String id, Color color, Boolean isAlive) {
        super(id, color, isAlive);
    }

    @Override
    public Boolean getAlive() {
        return super.getAlive();
    }

    @Override
    public void setAlive(Boolean alive) {
        super.setAlive(alive);
    }

    @Override
    public String toString() {
        return "King";
    }

    @Override
    public Position move(Position moveTo) {
        return null;
    }

    @Override
    public Position attack(Position attackTo) {
        return null;
    }
}
