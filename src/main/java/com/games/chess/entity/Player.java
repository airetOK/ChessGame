package com.games.chess.entity;

import java.util.List;

public class Player {

    private String userName;
    private Color color;
    private List<Chessman> chessmen;

    public Player(String userName, Color color) {
        this.userName = userName;
        this.color = color;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public List<Chessman> getChessmen() {
        return chessmen;
    }

    public void setChessmen(List<Chessman> chessmen) {
        this.chessmen = chessmen;
    }

    @Override
    public String toString() {
        return "Player{" +
                "userName='" + userName + '\'' +
                ", color=" + color +
                ", chessmen=" + chessmen +
                '}';
    }
}
