package com.games.chess.entity;

public class Position {

    private String name;
    private Boolean isEmpty;
    private Boolean isKingThere;
    private Chessman chessman;

    public Position(String name, Boolean isEmpty, Boolean isKingThere, Chessman chessman) {
        this.name = name;
        this.isEmpty = isEmpty;
        this.isKingThere = isKingThere;
        this.chessman = chessman;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getEmpty() {
        return isEmpty;
    }

    public void setEmpty(Boolean empty) {
        isEmpty = empty;
    }

    public Boolean getKingThere() {
        return isKingThere;
    }

    public void setKingThere(Boolean kingThere) {
        isKingThere = kingThere;
    }

    public Chessman getChessman() {
        return chessman;
    }

    public void setChessman(Chessman chessman) {
        this.chessman = chessman;
    }

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", isEmpty=" + isEmpty +
                ", isKingThere=" + isKingThere +
                ", chessman=" + chessman +
                '}';
    }
}
