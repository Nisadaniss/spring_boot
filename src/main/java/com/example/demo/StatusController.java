package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class StatusController {

    @GetMapping("/api/status")
    public String getStatus() {
        return "Sistem Güncellendi aktif: " + LocalDateTime.now() + " - CI/CD Adımları Başladı.";
    }
}