package com.ptp.northtexastechservice.service;

import com.ptp.northtexastechservice.dto.ConsultationRequest;
import com.ptp.northtexastechservice.model.Consultation;
import com.ptp.northtexastechservice.repository.ConsultationRepository;
import org.springframework.stereotype.Service;

@Service
public class ConsultationServiceImpl implements ConsultationService {

    private final ConsultationRepository consultationRepository;

    public ConsultationServiceImpl(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }

    @Override
    public void submitConsultation(
            ConsultationRequest request) {
        System.out.println("===== NEW CONSULTATION =====");
        System.out.println("Name: " + request.name());
        System.out.println("Email: " + request.email());
        System.out.println("Company: " + request.company());
        System.out.println("Phone: " + request.phone());
        System.out.println("Details: " + request.projectDetails());
        System.out.println("============================");
        Consultation data = new Consultation();
        data.setName(request.name());
        data.setEmail(request.email());
        data.setCompany(request.company());
        data.setPhone(request.phone());
        data.setProjectDetails(request.projectDetails());
        consultationRepository.save(data);
    }
}