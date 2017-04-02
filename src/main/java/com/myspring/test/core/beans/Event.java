package com.myspring.test.core.beans;

import com.oracle.javafx.jmx.json.JSONReader;
import javafx.event.EventType;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by Tillis on 08.12.16.
 */
public class Event {
    private int id;
    private String msg;
    private Date date;
    private DateFormat df;


    public Event(Date date, DateFormat df){
        super();
        id=(int)Math.floor(Math.random()*1000)+5000;
        this.date = date;
        this.df = df;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + df.format(date) +
                "}\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
