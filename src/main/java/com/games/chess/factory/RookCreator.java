package com.games.chess.factory;

import com.games.chess.entity.*;

public class RookCreator implements ChessCreator {

    @Override
    public Chessman create(String id, Position position, Color color) {
        return new Rook(id, position, color, true);
    }
}
