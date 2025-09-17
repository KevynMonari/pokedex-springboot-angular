package com.pokedex.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PokemonSprites {

    private OtherSprites other;

     @JsonProperty("front_default")
    private String frontDefault;

    public OtherSprites getOther() { return other; }
    public void setOther(OtherSprites other) { this.other = other; }
        public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }
}
