package com.games.chess.strategy;

import com.games.chess.entity.Action;
import com.games.chess.entity.Chessman;
import com.games.chess.entity.Position;

public abstract class GameStrategy {

    private Chessman chessman;
    private Position position;

    public Chessman getChessman() {
        return chessman;
    }

    public void setChessman(Chessman chessman) {
        this.chessman = chessman;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public abstract void execute(Action action, Position position);
}
