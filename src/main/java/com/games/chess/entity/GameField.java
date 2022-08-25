package com.games.chess.entity;

import java.util.List;

public class GameField {

    private List<Chessman> chessmen;
    private List<Position> cells;

    public GameField() {
    }

    public GameField(List<Chessman> chessmen, List<Position> cells) {
        this.chessmen = chessmen;
        this.cells = cells;
    }

    public List<Chessman> getChessmen() {
        return chessmen;
    }

    public void setChessmen(List<Chessman> chessmen) {
        this.chessmen = chessmen;
    }

    public List<Position> getCells() {
        return cells;
    }

    public void setCells(List<Position> cells) {
        this.cells = cells;
    }

    public boolean remove(Chessman chessman) {
        return this.chessmen.removeIf(c -> c.getId().equals(chessman.getId()));
    }

    @Override
    public String toString() {
        return "GameField{" +
                "chessmen=" + chessmen +
                ", cells=" + cells +
                '}';
    }
}
