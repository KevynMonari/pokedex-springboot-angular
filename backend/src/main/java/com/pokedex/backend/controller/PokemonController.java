package com.pokedex.backend.controller;

import com.pokedex.backend.model.Pokemon;
import com.pokedex.backend.service.PokemonService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokemons")
@CrossOrigin(origins = "http://localhost:4200")
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping
    public List<Pokemon> getAllPokemons() {
        return pokemonService.getAllPokemons();
    }

    @GetMapping("/{id}")
    public Pokemon getPokemonById(@PathVariable int id){
        return pokemonService.getPokemonById(id);
    }
}
