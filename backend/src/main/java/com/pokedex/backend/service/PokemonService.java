package com.pokedex.backend.service;

import com.pokedex.backend.model.PokeApiResponse;
import com.pokedex.backend.model.Pokemon;
import com.pokedex.backend.model.PokeDetail;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PokemonService {

    private final RestTemplate restTemplate;

    public PokemonService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private static final String POKEAPI_URL = "https://pokeapi.co/api/v2/pokemon?limit=20";

    public List<Pokemon> getAllPokemons() {
        PokeApiResponse response = restTemplate.getForObject(POKEAPI_URL, PokeApiResponse.class);

        if (response == null || response.getResults() == null) {
            return List.of();
        }

        return response.getResults().stream().map(pokeSummary -> {
            PokeDetail detail = restTemplate.getForObject(pokeSummary.getUrl(), PokeDetail.class);
            if (detail == null) return null;

            // Tratamento da imagem
            String imageUrl = null;
            if (detail.getSprites() != null) {
                if (detail.getSprites().getOther() != null
                        && detail.getSprites().getOther().getDreamWorld() != null) {
                    imageUrl = detail.getSprites().getOther().getDreamWorld().getFrontDefault();
                }
                // fallback para front_default normal
                if (imageUrl == null) {
                    imageUrl = detail.getSprites().getFrontDefault();
                }
            }

            return new Pokemon(
                    detail.getId(),
                    detail.getName(),
                    detail.getTypes().stream().map(t -> t.getType().getName()).toList(),
                    detail.getAbilities().stream().map(a -> a.getAbility().getName()).toList(),
                    detail.getWeight() / 10.0,
                    imageUrl
            );
        }).filter(p -> p != null).collect(Collectors.toList());
    }
}
