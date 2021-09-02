package com.example.Todo;

public class ToDo {
    private String inhalt;
    private boolean done;

    public boolean isDone() {
        return done;
    }
    public void setDone(boolean done) {
        this.done = done;
    }

    public String getInhalt() {
        return inhalt;
    }
    public void setInhalt(String inhalt) {
        this.inhalt = inhalt;
    }

}
