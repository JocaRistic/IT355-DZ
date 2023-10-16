package org.example.services;

import org.example.interfaces.Oblik;
import org.springframework.stereotype.Service;

@Service
public class OblikService {
    public void oblikInfo(Oblik oblik) {
        System.out.println(oblik.getClass().getName());
        System.out.println("Povrsina: " + oblik.povrsina());
        System.out.println("Obim: " + oblik.obim());
    }
}
