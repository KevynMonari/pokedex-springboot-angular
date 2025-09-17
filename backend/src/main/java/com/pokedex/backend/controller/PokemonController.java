package com.pokedex.backend.controller;

import com.pokedex.backend.model.Pokemon;
import com.pokedex.backend.service.PokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/pokemons")
    public List<Pokemon> getAllPokemons() {
        return pokemonService.getAllPokemons();
    }
}
