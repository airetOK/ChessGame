package com.games.chess.entity;

public class Rook extends Chessman {

    public Rook(String id, Position startPosition, Color color, Boolean isAlive) {
        super(id, startPosition, color, isAlive);
    }

    @Override
    public Position getCurrentPosition() {
        return super.getCurrentPosition();
    }

    @Override
    public void setCurrentPosition(Position currentPosition) {
        super.setCurrentPosition(currentPosition);
    }

    @Override
    public Position getMoveTo() {
        return super.getMoveTo();
    }

    @Override
    public void setMoveTo(Position moveTo) {
        super.setMoveTo(moveTo);
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
        return "Rook";
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
