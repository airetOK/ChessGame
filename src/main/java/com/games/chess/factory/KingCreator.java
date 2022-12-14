package com.games.chess.factory;

import com.games.chess.entity.*;

public class KingCreator implements ChessCreator {

    @Override
    public Chessman create(String id, Position position, Color color) {
        return new King(id, color, true);
    }
}
