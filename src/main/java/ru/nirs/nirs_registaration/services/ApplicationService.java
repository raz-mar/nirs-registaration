package ru.nirs.nirs_registaration.services;

import org.springframework.stereotype.Service;
import ru.nirs.nirs_registaration.model.Application;
import ru.nirs.nirs_registaration.model.ApplicationRequest;
import ru.nirs.nirs_registaration.model.ApplicationStatus;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicationService {
    private static long nextId = 0;
    private final List<Application> applications = new ArrayList<>();

    public Application submit(ApplicationRequest request) {
        Application application = new Application(
                                        ++nextId,
                                        request.title(),
                                        request.theses(),
                                        ApplicationStatus.DRAFT);

        applications.add(application);
        return application;
    }

    public List<Application> findAll() {
        return new ArrayList<>(applications);
    }

    public Application get(long id) {
        Application found = null;
        for (Application application : applications) {
            if (application.getId() == id) {
                found = application;
            }
        }

        return found;
    }

    public Application edit(long id, ApplicationRequest request) {
        Application application = get(id);

        if ( (application != null) && (application.getStatus() == ApplicationStatus.DRAFT)) {
            application.setTitle(request.title());
            application.setTheses(request.theses());
        }

        return application;
    }

    public void delete(long id) {
        Application application = get(id);

        if (application != null) {
            application.setStatus(ApplicationStatus.DELETED);
            applications.remove(application);
        }
    }
}
