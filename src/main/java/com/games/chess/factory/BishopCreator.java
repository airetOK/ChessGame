package com.games.chess.factory;

import com.games.chess.entity.*;

public class BishopCreator implements ChessCreator {

    @Override
    public Chessman create(String id, Position position, Color color) {
        return new Bishop(id, position, color, true);
    }
}
