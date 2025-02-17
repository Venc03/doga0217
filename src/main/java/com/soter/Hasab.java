package com.soter;

public class Hasab extends Gomb {
    private double fajsuly;

    public Hasab(double m, double a, double b) {
        super(a, b, m);
    }

    public Hasab(double m, double a, double b, double fajsuly) {
        super(m, a, b);
        this.fajsuly = fajsuly;
    }

}
