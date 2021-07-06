package com.syncretis.handler;

public class GlassHandler implements MainHandler{
    private final double mass;

    public GlassHandler(double mass) {
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
