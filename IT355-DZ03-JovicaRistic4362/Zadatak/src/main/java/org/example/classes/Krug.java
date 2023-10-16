package org.example.classes;

import org.example.interfaces.Oblik;

public class Krug implements Oblik {

    private double poluprecnik;

    public Krug(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    public double getPoluprecnik() {
        return poluprecnik;
    }

    public void setPoluprecnik(double poluprecnik) {
        if(poluprecnik>=0){
            this.poluprecnik = poluprecnik;
        }else{
            throw new RuntimeException("Broj ne sme biti negativan");
        }
    }


    @Override
    public double obim() {
        return 2 * poluprecnik * Math.PI;
    }

    @Override
    public double povrsina() {
        return Math.PI * poluprecnik * poluprecnik;
    }
}
