package com.games.chess.strategy;

import com.games.chess.entity.Action;
import com.games.chess.entity.Position;

public class GameContext {

    private GameStrategy gameStrategy;

    public void setGameStrategy(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void execute(Action action, Position position) {
        this.gameStrategy.execute(action, position);
    }
}
