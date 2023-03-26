package ru.kubsu.geocoder.controller;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.kubsu.geocoder.dto.NominatimPlace;
import ru.kubsu.geocoder.dto.RestApiError;
import ru.kubsu.geocoder.model.Test;
import ru.kubsu.geocoder.service.TestService;

import java.util.Random;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 *
 */
@RestController
@RequestMapping("tests")
public class TestController {

    private final TestService service;

    @Autowired
    public TestController(final TestService service) {
        this.service = service;
    }

    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public Test build(final @PathVariable Integer id,
                      final @RequestParam String name) {
        return service.build(id, name);
    }

    @GetMapping(value = "/save", produces = APPLICATION_JSON_VALUE)
    public void save(final @RequestParam String name) {
        service.save(name);
    }

    @GetMapping(value = "/load/{name}", produces = APPLICATION_JSON_VALUE)
    public Test load(final @PathVariable String name) {
        return service.load(name);
    }

    @GetMapping(value = "/hello", produces = APPLICATION_JSON_VALUE)
    @SuppressWarnings("PMD.AvoidLiteralsInIfCondition")
    @SuppressFBWarnings("DMI_RANDOM_USED_ONLY_ONCE")
    public ResponseEntity<?> hello() {
        final Random random = new Random();
        if (random.nextDouble() > 0.5) {
            final NominatimPlace place = new NominatimPlace();
            return ResponseEntity
                .status(HttpStatus.OK)
                .body(place);
        } else {
            final RestApiError error = new RestApiError();
            return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(error);
        }
    }
}
