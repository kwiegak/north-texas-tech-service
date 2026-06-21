package com.ptp.northtexastechservice.repository;

import com.ptp.northtexastechservice.model.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository
        extends JpaRepository<Consultation, Long> {
}