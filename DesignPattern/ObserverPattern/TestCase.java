package com.java.DesignPattern.ObserverPattern;

import org.junit.Test;
/**
 * @Author HaiLong Liu
 * @Date 2017-09-26 17:05
 * @Since 1.0.0
 */
public class TestCase {

    @Test
    public void test1() {
        Reader reader = new Reader();
        Publisher publisher = new Publisher();
        publisher.addObserver(reader);
        publisher.publish("Java");
    }

    @Test
    public void test2() {
        Reader reader = new Reader();

        Publisher publisher = new Publisher();
        publisher.addObserver(reader);
        publisher.publish("Java");

        TVStation tvStation = new TVStation();
        tvStation.addObserver(reader);
        tvStation.play("Game Of Thrones");
    }
}
