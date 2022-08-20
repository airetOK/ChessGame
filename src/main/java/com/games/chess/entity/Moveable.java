package com.games.chess.entity;

public interface Moveable {

    Position move(Position moveTo);
    Position attack(Position attackTo);
}
