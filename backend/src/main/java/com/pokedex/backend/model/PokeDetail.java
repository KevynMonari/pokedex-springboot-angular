package com.pokedex.backend.model;

import java.util.List;

public class PokeDetail {
    
    private int id;
    private String name;
    private List<PokemonTypeSlot> types;
    private List<PokemonAbilitySlot> abilities;
    private double weight;
    private PokemonSprites sprites;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<PokemonTypeSlot> getTypes() {
        return types;
    }
    public void setTypes(List<PokemonTypeSlot> types) {
        this.types = types;
    }
    public List<PokemonAbilitySlot> getAbilities() {
        return abilities;
    }
    public void setAbilities(List<PokemonAbilitySlot> abilities) {
        this.abilities = abilities;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public PokemonSprites getSprites() {
        return sprites;
    }
    public void setSprites(PokemonSprites sprites) {
        this.sprites = sprites;
    }

    
}
