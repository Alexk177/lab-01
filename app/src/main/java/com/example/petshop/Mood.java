package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    private Date date;

    // NO-ARG constructor (default date)
    public Mood() {
        this.date = new Date();
    }

    // Constructor with argument
    public Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String getMoodString();
}