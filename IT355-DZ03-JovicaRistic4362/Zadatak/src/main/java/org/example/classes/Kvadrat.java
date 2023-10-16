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
        if(a>=0){
            this.a = a;
        }else{
            throw new IllegalArgumentException("Broj ne sme biti negativan");
        }
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
