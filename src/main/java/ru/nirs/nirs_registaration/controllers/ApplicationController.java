package ru.nirs.nirs_registaration.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.nirs.nirs_registaration.model.Application;
import ru.nirs.nirs_registaration.model.ApplicationRequest;
import ru.nirs.nirs_registaration.services.ApplicationService;

import java.net.URI;
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

    @GetMapping("/{id}")
    public ResponseEntity<Application> getApplication(@PathVariable long id) {
        Application application = mService.get(id);

        if (application != null) {
            return ResponseEntity.ok(application);
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping("create")
    public ResponseEntity<Application> submit(@RequestBody ApplicationRequest request) {
        Application application = mService.submit(request);
        return ResponseEntity.created(URI.create("/api/applications/" + application.getId())).body(application);
    }

   //@PutMapping("/{id}/edit")
    //public ResponseEntity<Application> edit(@PathVariable long id, @RequestBody ApplicationRequest request) {
        //Application application = mService.edit(id, request);

    //}
}
