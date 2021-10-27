package com.catninja.controller;

public class FactResponse {
    private final String fact;
    private final int lenght;

    public String getFact() {
        return fact;
    }

    public int getLenght() {
        return lenght;
    }

    public FactResponse(String fact) {
        this.fact = fact;
        this.lenght = fact.length();
    }
}
