package org.example.controller;

import org.example.domain.Automobil;
import org.example.domain.Korisnik;
import org.example.domain.ReservationValidator;
import org.example.domain.Rezervacija;
import org.example.service.AutomobilService;
import org.example.service.IznajmljivanjeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/iznajmi")
@SessionAttributes("rezervacija")
public class IznajmljivanjeCotroller {

    private IznajmljivanjeService iznajmljivanjeService;
    private AutomobilService automobilService;
    private ReservationValidator reservationValidator;

    @Autowired
    public IznajmljivanjeCotroller(IznajmljivanjeService iznajmljivanjeService,
                                   AutomobilService automobilService,
                                   ReservationValidator reservationValidator) {
        this.iznajmljivanjeService = iznajmljivanjeService;
        this.automobilService = automobilService;
        this.reservationValidator = reservationValidator;
    }

    @GetMapping()
    public String iznajmi(@RequestParam("automobilId") String automobilId, Model model){
        Rezervacija rezervacija = new Rezervacija();
        Korisnik korisnik = new Korisnik();

        Automobil auto = automobilService.getAutoById(automobilId);
        rezervacija.setAuto(auto);
        rezervacija.setKorisnik(korisnik);

        model.addAttribute("rezervacija", rezervacija);

        return "rezervacijaForm";
    }

    @PostMapping
    public String submitForm(@ModelAttribute("rezervacija") @Validated Rezervacija rezervacija, Model model, BindingResult result, SessionStatus status){
        if (result.hasErrors()) {
            return "rezervacijaForm";
        } else {
            iznajmljivanjeService.iznajmiAuto(rezervacija);
            List<Rezervacija> svaIznajmljivanja = iznajmljivanjeService.getIznajmljivanja();

            model.addAttribute("iznajmljivanja", svaIznajmljivanja);

            return "rezervacije";
        }
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setValidator(reservationValidator);
    }

}
