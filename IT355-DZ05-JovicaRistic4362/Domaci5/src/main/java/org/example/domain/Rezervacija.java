package org.example.domain;

import java.util.UUID;

public class Rezervacija {

    private String id;
    private Automobil auto;
    private Korisnik korisnik;

    public Rezervacija() {
        this.id = UUID.randomUUID().toString();
    }

    public Rezervacija(Automobil auto, Korisnik korisnik) {
        this.id = UUID.randomUUID().toString();
        this.auto = auto;
        this.korisnik = korisnik;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Automobil getAuto() {
        return auto;
    }

    public void setAuto(Automobil auto) {
        this.auto = auto;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    @Override
    public String toString() {
        return "Rezervacija{" +
                "id='" + id + '\'' +
                ", auto=" + auto +
                ", korisnik=" + korisnik +
                '}';
    }
}
