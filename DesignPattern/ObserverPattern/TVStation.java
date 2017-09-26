package com.java.DesignPattern.ObserverPattern;

import java.util.Observable;

/**
 * @Author HaiLong Liu
 * @Date 2017-09-26 17:17
 * @Since 1.0.0
 */
public class TVStation extends Observable {
    private String name;

    public String getName() {
        return name;
    }

    public void play(String name) {
        this.name = name;
        setChanged();
        notifyObservers(this);
    }
}
