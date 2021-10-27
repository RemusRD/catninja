package com.catninja.service;


import com.catninja.repository.FactRepository;
import org.springframework.stereotype.Service;

@Service
public class FactService {

    private final FactRepository factRepository;

    public FactService(FactRepository factRepository) {
        this.factRepository = factRepository;
    }

    public String getFact() {
        return factRepository.getRandomFact();
    }
}
