package com.games.chess.strategy;

import com.games.chess.entity.Action;
import com.games.chess.entity.Position;

public class QueenStrategy extends GameStrategy {

    @Override
    public void execute(Action action, Position position) {
        checkActionValidity(action);
        if (action.equals(Action.MOVE)) {
            this.getChessman().move(position);
        } else {
            this.getChessman().attack(position);
        }
    }

    @Override
    public void checkActionValidity(Action action) {
        if (action.equals(Action.MOVE)) {
            //validation logic here
        } else {
            //validation logic here
        }
    }
}