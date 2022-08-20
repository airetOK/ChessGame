package com.games.chess.entity;

public abstract class Chessman implements Moveable {

    private String id;
    private Position currentPosition;
    private Position moveTo;
    private Boolean isAlive;
    private final Position startPosition;
    private final Color color;

    public Chessman(String id, Position startPosition, Color color) {
        this.id = id;
        this.startPosition = startPosition;
        this.color = color;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Position currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Position getMoveTo() {
        return moveTo;
    }

    public void setMoveTo(Position moveTo) {
        this.moveTo = moveTo;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Chessman{" +
                "id='" + id + '\'' +
                ", currentPosition=" + currentPosition +
                ", moveTo=" + moveTo +
                ", isAlive=" + isAlive +
                ", startPosition=" + startPosition +
                ", color=" + color +
                '}';
    }
}