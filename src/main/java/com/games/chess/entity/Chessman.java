package com.games.chess.entity;

public abstract class Chessman implements Moveable {

    private String id;
    private Boolean isAlive;
    private final Color color;

    public Chessman(String id, Color color, Boolean isAlive) {
        this.id = id;
        this.color = color;
        this.isAlive = isAlive;
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
}
