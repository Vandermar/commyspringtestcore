package com.myspring.test.core.loggers;

import com.myspring.test.core.beans.Event;

/**
 * Created by Tillis on 04.12.16.
 */
public class ConsoleEventLogger implements EventLogger {

    public void logEvent(Event event){
        System.out.print(event);
    }
}
