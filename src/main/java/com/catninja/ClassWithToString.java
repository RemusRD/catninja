package com.catninja;


public class ClassWithToString {
    private final String type;
    private final String name;

    public ClassWithToString(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
