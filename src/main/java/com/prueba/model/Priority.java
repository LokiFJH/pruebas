package com.prueba.model;

public enum Priority {
    LOW(0),MEDIUM(1),HIGH(2),CRITICAL(3),BLOCKING(4);
    private final int value;


    Priority(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
