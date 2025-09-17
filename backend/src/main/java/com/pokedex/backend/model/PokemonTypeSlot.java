package com.pokedex.backend.model;

public class PokemonTypeSlot {
    
    private int slot;
    private PokemonType type;

    // getters e setters
    public int getSlot() { return slot; }
    public void setSlot(int slot) { this.slot = slot; }

    public PokemonType getType() { return type; }
    public void setType(PokemonType type) { this.type = type; }
}
