package com.metropolitan.domaci10.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class Listener {

    @JmsListener(destination = "dz10")
    public void listener(String message){
        System.out.println("Pristigla poruka je " + message);
    }
}
