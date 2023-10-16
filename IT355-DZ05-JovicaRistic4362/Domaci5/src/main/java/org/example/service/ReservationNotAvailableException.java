package org.example.service;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReservationNotAvailableException extends RuntimeException{

    private String ime;
    private String prezime;
    private String email;

    public ReservationNotAvailableException(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public ReservationNotAvailableException() {
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
}
