package com.games.chess.entity;

import java.util.Arrays;
import java.util.List;

public class GameField {

    private List<Chessman> chessmen;
    private Position[][] cells;

    public GameField(List<Chessman> chessmen, Position[][] cells) {
        this.chessmen = chessmen;
        this.cells = cells;
    }

    public List<Chessman> getChessmen() {
        return chessmen;
    }

    public void setChessmen(List<Chessman> chessmen) {
        this.chessmen = chessmen;
    }

    public Position[][] getCells() {
        return cells;
    }

    public void setCells(Position[][] cells) {
        this.cells = cells;
    }

    public boolean remove(Chessman chessman) {
        return this.chessmen.removeIf(c -> c.getId().equals(chessman.getId()));
    }

    @Override
    public String toString() {
        return "GameField{" +
                "chessmen=" + chessmen +
                ", cells=" + Arrays.toString(cells) +
                '}';
    }
}
