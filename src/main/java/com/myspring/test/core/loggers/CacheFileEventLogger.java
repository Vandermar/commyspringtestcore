package com.myspring.test.core.loggers;

import com.myspring.test.core.beans.Event;

import java.util.List;

/**
 * Created by Tillis on 30.03.17.
 */
public class CacheFileEventLogger extends FileEventLogger {
    int cacheSize;
    List<Event> cache;

    public CacheFileEventLogger(String filename, int cacheSize) {
        super(filename);
        this.cacheSize=cacheSize;
    }
public void writesEventsFromCache(){
    for (Event e:cache) {
        super.logEvent(e);
    }

}

    public void logEvent(Event event){
        cache.add(event);
        if(cache.size()==cacheSize){
            writesEventsFromCache();
            cache.clear();
        }
    }

    public  void destroy(){
        if(!cache.isEmpty()){
            writesEventsFromCache();
            cache.clear();
        }
    }
}
