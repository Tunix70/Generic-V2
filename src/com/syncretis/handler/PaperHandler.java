package com.syncretis.handler;

public class PaperHandler implements MainHandler{
    private final double mass;

    public PaperHandler(double mass) {
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }

    @Override
    public void printMass() {
        System.out.println("After handler mass is= " + getMass());
    }
}
