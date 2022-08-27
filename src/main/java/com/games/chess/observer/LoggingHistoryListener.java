package com.games.chess.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoggingHistoryListener implements EventListener {

    private EventManager eventManager;

    @Autowired
    public LoggingHistoryListener(EventManager eventManager) {
        this.eventManager = eventManager;
        this.eventManager.subscribe("loggingHistoryListener", this);
    }

    public EventManager getEventManager() {
        return eventManager;
    }

    public void setEventManager(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    @Override
    public String info(String message) {
        // in future release change println() to LOGGER
        System.out.println("LOGGING IS " + message);
        return null;
    }
}
