package com.prueba.model;

public enum Status {
    OPEN(0),ON_PROGRESS(1),FINISHED(2);
    private final int value;


    Status(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
