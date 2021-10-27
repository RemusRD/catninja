package com.catninja.controller;

import com.catninja.service.FactService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactController {

    private final FactService factService;

    public FactController(FactService factService) {
        this.factService = factService;
    }

    @GetMapping("/fact")
    public ResponseEntity<FactResponse> getFact() {
        final var fact = factService.getFact();
        return ResponseEntity.ok(new FactResponse(fact));
    }
}
