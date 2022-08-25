package com.games.chess.factory;

import com.games.chess.entity.*;

public class QueenCreator implements ChessCreator {

    @Override
    public Chessman create(String id, Position position, Color color) {
        return new Queen(id, position, color, true);
    }
}
