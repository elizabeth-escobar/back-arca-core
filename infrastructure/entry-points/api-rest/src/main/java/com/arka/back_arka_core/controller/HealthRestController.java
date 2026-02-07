package com.arka.back_arka_core.controller;

import org.springframework.web.bind.annotation.GetMapping; // Importación necesaria
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthRestController {

    @GetMapping("/health") // Define la ruta de acceso
    public String getHealth() {
        return "UP";
    }
}