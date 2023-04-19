package net.company.pokedex;

import net.company.pokedex.types.Legendary;
import net.company.pokedex.types.Pokemon;
import net.company.pokedex.utilities.ListaPokemon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaPokemon spottedPokemon = new ListaPokemon();
        ListaPokemon caughtPokemon = new ListaPokemon();

        int option = -1;

        Scanner keyboard = new Scanner(System.in);

        while (option != 6) {
            String pokemonName;
            String pokemonType;
            String pokemonWeight;
            String pokemonHeight;
            String pokemonDescription;
            String legendaryLocation;

            String boxGraphic = "\n╔═════════════════════════════════════════╗";
            boxGraphic += "\n║              P O K É D E X              ║";
            boxGraphic += "\n╟─────────────────────────────────────────╢";
            boxGraphic += "\n║        ¡Te damos la bienvenida          ║ ";
            boxGraphic += "\n║             a esta Pokédex!             ║";
            boxGraphic += "\n║                                         ║";
            boxGraphic += "\n║            Elige una opción             ║";
            boxGraphic += "\n║                                         ║";
            boxGraphic += "\n║ 1. Añadir Pokémon avistado              ║";
            boxGraphic += "\n║ 2. Añadir avistamiento legendario       ║";
            boxGraphic += "\n║ 3. Pasar a capturados                   ║";
            boxGraphic += "\n║ 4. Mostrar lista de avistados           ║";
            boxGraphic += "\n║ 5. Mostrar lista de capturados          ║";
            boxGraphic += "\n║ 6. Cerrar la Pokédex                    ║";
            boxGraphic += "\n║                                         ║";
            boxGraphic += "\n╚═════════════════════════════════════════╝";

            System.out.println(boxGraphic);
            option = keyboard.nextInt();
            keyboard.nextLine();


            switch (option) {
                case 1:
                    System.out.println("Introduzca el nombre del Pokémon avistado:");
                    pokemonName = keyboard.nextLine();

                    System.out.println("Introduzca el tipo del Pokémon avistado:");
                    pokemonType = keyboard.nextLine();

                    Pokemon newPokemon = new Pokemon(pokemonName, pokemonType);
                    spottedPokemon.addPokemon(newPokemon);
                    break;

                case 2:
                    System.out.println("Introduzca el nombre del Pokémon legendario avistado:");
                    pokemonName = keyboard.nextLine();

                    System.out.println("Introduzca el tipo del Pokémon legendario avistado:");
                    pokemonType = keyboard.nextLine();

                    System.out.println("Introduzca la localización del Pokémon legendario avistado:");
                    legendaryLocation = keyboard.nextLine();

                    Legendary newLegendary = new Legendary(pokemonName, pokemonType, legendaryLocation);
                    spottedPokemon.addPokemon(newLegendary);

                    break;

                case 3:
                    System.out.println("Introduce el nombre del Pokémon capturado:");
                    pokemonName = keyboard.nextLine();
                    if (spottedPokemon.findPokemon(pokemonName) != null) {
                        caughtPokemon.addPokemon(spottedPokemon.findPokemon(pokemonName));
                        spottedPokemon.deletePokemon(pokemonName);

                        System.out.println("Introduce la descripción de este Pokémon:");
                        pokemonDescription = keyboard.nextLine();

                        System.out.println("Introduce el peso del Pokémon:");
                        pokemonWeight = keyboard.nextLine();

                        System.out.println("Introduce la altura del Pokémon:");
                        pokemonHeight = keyboard.nextLine();


                        for (int i = 0; i < caughtPokemon.listSize; i++) {
                            if (caughtPokemon.pokemonList[i].getName().equals(pokemonName)) {
                                caughtPokemon.pokemonList[i].setDescription(pokemonDescription);
                                caughtPokemon.pokemonList[i].setWeight(pokemonWeight);
                                caughtPokemon.pokemonList[i].setHeight(pokemonHeight);
                                caughtPokemon.pokemonList[i].catchPokemon();
                            }
                        }

                    } else {
                        System.out.println("Este Pokémon no está en la lista de avistados.");
                    }
                    break;


                case 4:
                    spottedPokemon.showPokemonList();
                    break;

                case 5:
                    caughtPokemon.showPokemonList();
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Esta no es una opción válida.");
                    break;
            }

        }

        keyboard.close();
    }
}
