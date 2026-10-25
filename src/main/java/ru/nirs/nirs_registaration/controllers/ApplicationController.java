package ru.nirs.nirs_registaration.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.nirs.nirs_registaration.model.Application;
import ru.nirs.nirs_registaration.model.ApplicationRequest;
import ru.nirs.nirs_registaration.services.ApplicationService;

import java.util.List;

@RestController
@RequestMapping("api/applications")
public class ApplicationController {
    private final ApplicationService mService;

    public ApplicationController(ApplicationService service) {
        this.mService = service;
    }

    @GetMapping
    public ResponseEntity<List<Application>> getApplications() {
        return ResponseEntity.ok(mService.findAll());
    }
}
