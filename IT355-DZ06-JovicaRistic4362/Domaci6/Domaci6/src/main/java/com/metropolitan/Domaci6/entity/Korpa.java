package com.metropolitan.Domaci6.entity;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Korpa {

    private List<Proizvod> proizvodi = new ArrayList<>();

    public Korpa() {
    }

    public void dodajUKorpu(Proizvod proizvod){
        proizvodi.add(proizvod);
    }

    public double ukupnaCena(){
        double cena = 0;
        for (Proizvod proizvod : proizvodi){
            cena += proizvod.getCena();
        }
        return cena;
    }

    public List<Proizvod> getProizvodi() {
        return proizvodi;
    }

    public void setProizvodi(List<Proizvod> proizvodi) {
        this.proizvodi = proizvodi;
    }

    @Override
    public String toString() {
        return "Korpa{" +
                "proizvodi=" + proizvodi +
                '}';
    }
}
