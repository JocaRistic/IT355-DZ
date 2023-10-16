package org.example.classes;

import org.example.interfaces.Oblik;

public class JednakostranicniTrougao implements Oblik {

    private double a;

    public JednakostranicniTrougao(double a) {
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
        return 3 * a;
    }

    @Override
    public double povrsina() {
        return (Math.sqrt(3) / 4) * (a * a);
    }
}
