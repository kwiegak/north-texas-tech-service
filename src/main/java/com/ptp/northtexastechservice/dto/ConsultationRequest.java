package com.ptp.northtexastechservice.dto;

public record ConsultationRequest(
        String name,
        String email,
        String company,
        String phone,
        String projectDetails
) {
}