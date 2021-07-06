package com.syncretis.handler;

public class PlasticHandler implements MainHandler {
    private final double mass;

    public PlasticHandler(double mass) {
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
