package org.example.service;

import org.example.domain.Automobil;
import org.example.domain.Korisnik;
import org.example.domain.Rezervacija;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IznajmljivanjeServiceImpl implements IznajmljivanjeService {

    private List<Rezervacija> rezervacije = new ArrayList<>();

    @Override
    public void iznajmiAuto(Rezervacija rezervacija) {
        rezervacije.add(rezervacija);
    }

    @Override
    public List<Rezervacija> getIznajmljivanja() {
        return rezervacije;
    }
}
