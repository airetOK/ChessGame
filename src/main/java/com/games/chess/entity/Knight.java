package com.games.chess.entity;

public class Knight extends Chessman {

    public Knight(String id, Color color, Boolean isAlive) {
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
        return "Knight";
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
