package com.misiontic.ecoturism.exceptions;

public class PlanNotFoundException extends RuntimeException{

    public PlanNotFoundException(String message) {
        super(message);
    }
}
