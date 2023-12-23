package com.dp;

import java.io.Serializable;

public class Singleton implements Serializable{

    private static volatile Singleton instance;
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
