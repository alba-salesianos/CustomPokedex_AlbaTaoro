package net.company.pokedex.utilities;

import net.company.pokedex.types.Pokemon;

public class ListaPokemon {
    public int listSize = 0;
    public Pokemon pokemonList[] = new Pokemon[1];

    public ListaPokemon() {
    }

    public void addPokemon(Pokemon newPokemon) {
        pokemonList[listSize] = newPokemon;
        listSize++;

        Pokemon tempPokemonList[] = new Pokemon[listSize + 1];

        for (int i = 0; i < pokemonList.length; i++) {
            tempPokemonList[i] = pokemonList[i];
        }

        this.pokemonList = tempPokemonList;
    }

    public void deletePokemon(String pokemonName) {
        boolean isDeleted = false;
        int registeredPokemon = 0;
        int counter = 0;
        for (int i = 0; i < pokemonList.length - 1; i++) {
            if (pokemonList[i].getName().equals(pokemonName)) {
                pokemonList[i] = null;
                isDeleted = true;
            } else {
                registeredPokemon++;

            }
        }

        Pokemon tempPokemonList[] = new Pokemon[registeredPokemon + 1];


        for (int j = 0; j < pokemonList.length; j++) {

            if (pokemonList[j] != null) {
                tempPokemonList[counter] = pokemonList[j];
                counter++;
            }

        }

        this.pokemonList = tempPokemonList;

        if (isDeleted == true) {
            System.out.println("Pokemon eliminado.");
        } else {
            System.out.println("Este pokemon no se encuentra en la lista.");
        }

    }

    public Pokemon findPokemon(String pokemonName) {
        for (int i = 0; i < pokemonList.length; i++) {
            if (pokemonList[i].getName().equals(pokemonName)) {
                return pokemonList[i];
            }
        }
        return null;
    }

    public void showPokemonList() {
        String msg = "";
        for (int i = 0; i < pokemonList.length; i++) {
            if (pokemonList[i] != null) {
                msg += "\n" + pokemonList[i].toString();
            }
        }
        System.out.println(msg);
    }


}
