package com.soter;

import com.soter.idomok.FaIdom;

import java.util.ArrayList;

public class FaIdomokProgram {
    private static ArrayList<FaIdom> lista = new ArrayList<>(5);

    public void ujIdom(Gomb gomb) {
        lista.add(gomb);
    }

    public void ujIdom(Hasab hasab) {
        lista.add(hasab);
    }

    public ArrayList<FaIdom> getLista() {
        return this.lista;
    }

    public double osszSuly() {
        return 0;
    }

    public double gombokOsszSuly() {
        return 0;
    }

    public FaIdom minV() {

        return null;
    }

    public FaIdom maxV() {

        return null;
    }
}
