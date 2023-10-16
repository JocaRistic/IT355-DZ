package org.example.service;

import org.example.domain.Automobil;
import org.example.domain.Korisnik;
import org.example.domain.Rezervacija;

import java.util.List;

public interface IznajmljivanjeService {

    void iznajmiAuto(Rezervacija rezervacija);

    List<Rezervacija> getIznajmljivanja();

}
