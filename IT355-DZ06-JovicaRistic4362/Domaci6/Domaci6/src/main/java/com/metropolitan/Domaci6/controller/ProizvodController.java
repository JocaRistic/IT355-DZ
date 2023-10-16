package com.metropolitan.Domaci6.controller;

import com.metropolitan.Domaci6.entity.Korisnik;
import com.metropolitan.Domaci6.entity.Korpa;
import com.metropolitan.Domaci6.entity.Proizvod;
import com.metropolitan.Domaci6.repository.ProizvodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
//@RequestMapping("/shop")
public class ProizvodController {

    @Autowired
    private ProizvodRepository proizvodRepository;

    @Autowired
    private Korpa korpa;

    @GetMapping("/")
    public String index(Model model){
        List<Proizvod> sviProizvodi = proizvodRepository.findAll();
        model.addAttribute("proizvodi", sviProizvodi);
        return "index";
    }

    @GetMapping("/korpa/{id}")
    public String dodajUKorpu(@PathVariable Long id, Model model){
        Optional<Proizvod> proizvod = proizvodRepository.findById(id);
        korpa.dodajUKorpu(proizvod.get());
        return "redirect:/";
    }

    @GetMapping("/mojaKorpa")
    public String prikaziKorpu(Model model){
        List<Proizvod> proizvodiIzKorpe = korpa.getProizvodi();
        model.addAttribute("proizvodiKorpa", proizvodiIzKorpe);
        model.addAttribute("korisnik", new Korisnik());
        return "korpa";
    }

    @PostMapping("/checkout")
    public String checkout(@Validated Korisnik korisnik, BindingResult result, Model model){
        if (result.hasErrors()) {
            return "korpa";
        }
        model.addAttribute("ukupnaCena", korpa.ukupnaCena());
        model.addAttribute("korisnik", korisnik);
        return "success";
    }

}
