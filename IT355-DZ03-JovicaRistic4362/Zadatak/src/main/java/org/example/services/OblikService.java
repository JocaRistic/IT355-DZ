package org.example.services;

import org.example.classes.JednakostranicniTrougao;
import org.example.classes.Krug;
import org.example.classes.Kvadrat;
import org.example.interfaces.Oblik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OblikService {

    public double izracunajObim(Oblik oblik) {
        return oblik.obim();
    }

    public double izracunajPovrsinu(Oblik oblik) {
        return oblik.povrsina();
    }

}
