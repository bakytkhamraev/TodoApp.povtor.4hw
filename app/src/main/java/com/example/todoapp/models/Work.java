package com.example.todoapp.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
@Entity
public class Work implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private long id;
    String title;
    String desc;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Work() {
    }

    public Work(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }
}

