package com.myspring.test.core.loggers;

import com.myspring.test.core.beans.Event;

import java.util.Collection;

/**
 * Created by Tillis on 02.04.17.
 */
public class CombinedEventLogger implements EventLogger {
    private final Collection<EventLogger> loggers;
    public CombinedEventLogger(Collection<EventLogger> loggers) {
        super();
        this.loggers = loggers;
    }

    public void logEvent(Event event){

        for (EventLogger eventLogger : loggers) {
            eventLogger.logEvent(event);
        }
    }
}
