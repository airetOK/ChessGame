package com.games.chess.factory;

import com.games.chess.entity.Chessman;
import com.games.chess.entity.Color;
import com.games.chess.entity.Pawn;
import com.games.chess.entity.Position;

public class PawnCreator implements ChessCreator {

    @Override
    public Chessman create(String id, Position position, Color color) {
        return new Pawn(id, position, color);
    }

}
