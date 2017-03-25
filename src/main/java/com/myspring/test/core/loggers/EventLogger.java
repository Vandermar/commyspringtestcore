package com.myspring.test.core.loggers;

import com.myspring.test.core.beans.Event;

/**
 * Created by Tillis on 06.12.16.
 */
public interface EventLogger {
    public void logEvent(Event event);
}
