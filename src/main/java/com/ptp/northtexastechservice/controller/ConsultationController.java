package com.ptp.northtexastechservice.controller;

import com.ptp.northtexastechservice.dto.ConsultationRequest;
import com.ptp.northtexastechservice.service.ConsultationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/consultations")
@CrossOrigin(origins = "http://localhost:3000")
public class ConsultationController {

    private final ConsultationService consultationService;

    public ConsultationController(
            ConsultationService consultationService) {

        this.consultationService =
                consultationService;

        System.out.println(
                "ConsultationController loaded");
    }

    @PostMapping
    public ResponseEntity<String>
    submitConsultation(
            @RequestBody
            ConsultationRequest request) {

        consultationService
                .submitConsultation(request);

        return ResponseEntity.ok(
                "Consultation submitted successfully");
    }

    @GetMapping("/test")
    public String test() {
        return "API is working";
    }
}