package com.ptp.northtexastechservice.service;

import com.ptp.northtexastechservice.dto.ConsultationRequest;
import org.springframework.stereotype.Service;

@Service
public class ConsultationServiceImpl
        implements ConsultationService {

    @Override
    public void submitConsultation(
            ConsultationRequest request) {

        System.out.println(
                "===== NEW CONSULTATION =====");

        System.out.println(
                "Name: " + request.name());

        System.out.println(
                "Email: " + request.email());

        System.out.println(
                "Company: " + request.company());

        System.out.println(
                "Phone: " + request.phone());

        System.out.println(
                "Details: " + request.projectDetails());

        System.out.println(
                "============================");
    }
}