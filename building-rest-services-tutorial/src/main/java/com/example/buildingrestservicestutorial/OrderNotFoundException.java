package com.example.buildingrestservicestutorial;

public class OrderNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -7281078146265526368L;

    OrderNotFoundException(Long id) {
        super("Could not find order " + id);
    }
}