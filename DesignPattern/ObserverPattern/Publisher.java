package com.java.DesignPattern.ObserverPattern;

import java.util.Observable;

/**
 * @Author HaiLong Liu
 * @Date 2017-09-26 17:06
 * @Since 1.0.0
 */
public class Publisher extends Observable{
    private String magazineName;

    public String getMagazineName() {
        return magazineName;
    }

    public void publish(String magazineName) {
        this.magazineName = magazineName;
        setChanged();
        notifyObservers(this);
    }
}
