package com.soter;

import com.soter.idomok.FaIdom;

public class Gomb extends FaIdom {
    private double r;

    public Gomb(double m, double a, double b) {
        super(m, a, b);
    }

    public Gomb(double r) {
        super();
        this.r = r;
    }

    public Gomb() {
        super();
    }

    @Override
    public double terfogat() {
        return 4*Math.PI/3;
    }
}
