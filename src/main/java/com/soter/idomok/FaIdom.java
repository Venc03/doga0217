package com.soter.idomok;

public abstract class FaIdom {
    private double m, a, b;

    public FaIdom() {
    }

    public FaIdom(double m, double a, double b) {
        this.m = m;
        this.a = a;
        this.b = b;
    }

    public static double getFajsuly() {
        return 0;
    }

    public double terfogat() {
        return 0;
    }

    public double suly() {
        return 0;
    }

    public double getM() {
        return m;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}

