/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.domain;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class ReservationValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Rezervacija.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "korisnik.ime",
                "required.korisnik.ime", "Ime je obavezno.");
        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "korisnik.prezime",
                "required.korisnik.prezime", "Prezime je obavezno.");
        ValidationUtils.rejectIfEmpty(errors, "korisnik.email",
                "required.korisnik.email", "Email je obavezan.");
        
    }
}
