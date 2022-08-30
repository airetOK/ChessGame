package com.games.chess.factory;

import com.games.chess.entity.*;

public class KnightCreator implements ChessCreator {

    @Override
    public Chessman create(String id, Position position, Color color) {
        return new Knight(id, color, true);
    }
}
