package org.example.service;

import org.example.domain.Automobil;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AutomobilServiceImpl implements AutomobilService{

    private Map<String, Automobil> automobili = new TreeMap<>();

    public AutomobilServiceImpl() {
        Automobil auto1 = new Automobil(UUID.randomUUID().toString(), "Audi", "A4", 2016, "Dizel", 17990);
        Automobil auto2 = new Automobil(UUID.randomUUID().toString(), "BMW", "X1", 2012, "Dizel", 13000);
        Automobil auto3 = new Automobil(UUID.randomUUID().toString(), "Volkswagen", "Golf 6", 2011, "Benzin", 6999);

        automobili.put(auto1.getId(), auto1);
        automobili.put(auto2.getId(), auto2);
        automobili.put(auto3.getId(), auto3);

    }

    @Override
    public List<Automobil> getAllAuto() {
        return new ArrayList<>(automobili.values());
    }

    @Override
    public Automobil getAutoById(String id) {
        return automobili.get(id);
    }
}
