package com.smartphonebatch.controller;

import com.smartphonebatch.repository.SmartphoneRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SmartphoneController {

    private final SmartphoneRepository smartphoneRepository;

    public SmartphoneController(SmartphoneRepository smartphoneRepository) {
        this.smartphoneRepository = smartphoneRepository;
    }

    @GetMapping("/smartphonesList")
    public String getSmartphones(Model model) {
        model.addAttribute("smartphones", smartphoneRepository.findAll());
        return "smartphonesList"; // correspond au nom du fichier HTML
    }
}