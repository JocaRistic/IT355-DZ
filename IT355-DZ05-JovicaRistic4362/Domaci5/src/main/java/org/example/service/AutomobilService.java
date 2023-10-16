package org.example.service;

import org.example.domain.Automobil;
import java.util.List;

public interface AutomobilService {

    List<Automobil> getAllAuto();

    Automobil getAutoById(String id);

}
