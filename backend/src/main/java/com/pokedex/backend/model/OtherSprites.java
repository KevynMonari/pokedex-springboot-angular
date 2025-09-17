package com.pokedex.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OtherSprites {

    @JsonProperty("dream_world")
    private DreamWorldSprites dreamWorld;

    public DreamWorldSprites getDreamWorld() {
        return dreamWorld;
    }

    public void setDreamWorld(DreamWorldSprites dreamWorld) {
        this.dreamWorld = dreamWorld;
    }
}
