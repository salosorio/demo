package com.example.demo.repositorio;

import com.example.demo.dominio.DescriptionService;
import com.example.demo.dominio.MaintenanceService;
import com.example.demo.dominio.ServiceId;

import java.time.LocalDateTime;
import java.util.UUID;

public class ServiceDBO {

    private String id;
    private LocalDateTime startService;
    private LocalDateTime endService;
    private String description;

    public ServiceDBO(String id, LocalDateTime startService, LocalDateTime endService, String description) {
        this.id = id;
        this.startService = startService;
        this.endService = endService;
        this.description = description;
    }

    public ServiceDBO() {
    }

    public MaintenanceService toDomain() {

}
