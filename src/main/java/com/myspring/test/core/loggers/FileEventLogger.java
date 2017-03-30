package com.myspring.test.core.loggers;
import com.myspring.test.core.beans.Event;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

/**
 * Created by Tillis on 28.03.17.
 */
public class FileEventLogger implements EventLogger{
    private File file;
    private String filename;

    public FileEventLogger(String filename) {
        this.filename = filename;
    }

    public void init() {
        file = new File(filename);
        if (file.exists() && !file.canWrite()) {
            throw new IllegalArgumentException("Can't write to file " + filename);
        } else if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                throw new IllegalArgumentException("Can't create file", e);
            }

        }
    }
    public void logEvent(Event event) {
        try {
            FileUtils.writeStringToFile(file, event.toString(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
