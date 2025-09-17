package com.pokedex.backend.model;

import java.util.List;

public class Pokemon {
    private int id;
    private String name;
    private List<String> types;
    private List<String> abilities;
    private double weight;
    private String imageUrl;

    public Pokemon(){}

    public Pokemon(int id, String name, List<String> types, List<String> abilities, double weight, String imageUrl){
        this.id = id;
        this.name = name;
        this.types = types;
        this.abilities = abilities;
        this.weight = weight;
        this.imageUrl = imageUrl;
    }

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

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    
}
