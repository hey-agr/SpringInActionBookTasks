package com.springinaction.agr.instruments;

public class Saxophone implements Instrument {

    public Saxophone() {
    }

    @Override
    public void play() {
        System.out.print("TOOT TOOT TOOT");
    }
}
