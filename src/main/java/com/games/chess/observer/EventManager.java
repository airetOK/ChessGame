package com.games.chess.observer;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(ApplicationContext applicationContext) {
        for (String operation : applicationContext.getBeanNamesForType(EventListener.class)) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> listenerByType = listeners.get(eventType);
        listenerByType.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> listenerByType = listeners.get(eventType);
        listenerByType.remove(listener);
    }

    public void notify(String message, String eventType) {
        List<EventListener> listenerByType = listeners.get(eventType);
        for (EventListener listener : listenerByType) {
            listener.info(message);
        }
    }
}
