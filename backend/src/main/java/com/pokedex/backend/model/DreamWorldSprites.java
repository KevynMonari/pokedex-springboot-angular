package com.pokedex.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DreamWorldSprites {

    @JsonProperty("front_default")
    private String frontDefault;

    public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }
}
