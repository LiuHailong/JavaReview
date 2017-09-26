package com.java.DesignPattern.ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author HaiLong Liu
 * @Date 2017-09-26 17:09
 * @Since 1.0.0
 */
public class Reader implements Observer {
    public void update(Observable o, Object arg) {
//        Publisher p = (Publisher) o;
//        System.out.println("i wanna reader " + p.getMagazineName());

        if(o instanceof Publisher) {
            Publisher p = (Publisher) o;
            System.out.println("i wanna read " + p.getMagazineName());
        } else if (o instanceof TVStation) {
            TVStation tv = (TVStation) o;
            System.out.println("i wanna watch " + tv.getName());
        }
    }
}
