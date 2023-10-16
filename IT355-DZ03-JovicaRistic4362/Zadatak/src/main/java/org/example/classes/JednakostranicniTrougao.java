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
        if(a>=0){
            this.a = a;
        }else{
            throw new RuntimeException("Broj ne sme biti negativan");
        }
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
