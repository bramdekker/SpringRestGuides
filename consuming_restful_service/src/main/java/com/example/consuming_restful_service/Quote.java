package com.example.consuming_restful_service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private String type;
    private Value value;

    public Quote() {}

    public String getTyp() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
        "type='" + type + '\'' +
        ", value=" + value +
        '}';
    }
    
}