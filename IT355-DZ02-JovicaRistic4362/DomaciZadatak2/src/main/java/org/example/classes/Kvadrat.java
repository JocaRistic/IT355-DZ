package org.example.classes;

import org.example.interfaces.Oblik;

public class Kvadrat implements Oblik {

    private double a;

    public Kvadrat(double a){
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double obim() {
        return 4 * a;
    }

    @Override
    public double povrsina() {
        return a * a;
    }
}
