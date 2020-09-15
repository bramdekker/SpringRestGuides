package com.example.consuming_restful_service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class Value {
    @JsonProperty("id") private Long customId;
    private String quote;

    public Long getId() {
        return this.customId;
    }

    public void setId(Long id) {
        this.customId = id;
    }

    public String getQuote() {
        return this.quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Value{" +
        "id=" + customId +
        ", quote='" + quote + '\'' +
        '}';
    }
}