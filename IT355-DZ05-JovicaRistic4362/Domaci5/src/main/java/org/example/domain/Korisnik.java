package org.example.domain;

import java.util.UUID;

public class Korisnik {

    private String id;
    private String ime;
    private String prezime;
    private String email;

    public Korisnik() {
        this.id = UUID.randomUUID().toString();
    }

    public Korisnik(String ime, String prezime, String email) {
        this.id = UUID.randomUUID().toString();
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Korisnik{" +
                "id='" + id + '\'' +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
