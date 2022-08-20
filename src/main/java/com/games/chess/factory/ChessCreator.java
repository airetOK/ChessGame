package com.games.chess.factory;

import com.games.chess.entity.Chessman;
import com.games.chess.entity.Color;
import com.games.chess.entity.Position;

public interface ChessCreator {

    Chessman create(String id, Position position, Color color);
}
