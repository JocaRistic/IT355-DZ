package org.example.controller;

import org.example.service.AutomobilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class AutomobiliController {

    @Autowired
    private AutomobilService automobilService;

    @GetMapping
    public String sviAutomobili(Model model){

        model.addAttribute("automobili", automobilService.getAllAuto());

        return "automobiliList";
    }
}
