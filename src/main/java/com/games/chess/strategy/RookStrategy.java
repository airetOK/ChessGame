package com.games.chess.strategy;

import com.games.chess.entity.Action;
import com.games.chess.entity.Position;

public class RookStrategy extends GameStrategy {

    @Override
    public void execute(Action action, Position position) {
        if (action.equals(Action.MOVE)) {
            this.getChessman().move(position);
        } else {
            this.getChessman().attack(position);
        }
    }
}