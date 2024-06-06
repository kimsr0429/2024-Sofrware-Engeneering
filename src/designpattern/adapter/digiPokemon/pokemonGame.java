package designpattern.adapter.digiPokemon;

public class pokemonGame {
    public static void main(String[] args) {
        Pokemon pikachu = new Pikachu();
        Digimon agumon = new Agumon();
        Pokemon PikaAgumon = new DigimonAdapter(agumon);

        testPokemon(pikachu);
        testPokemon(PikaAgumon);
    }

    static void testPokemon(Pokemon pokemon){
        pokemon.attack();
        pokemon.defend();
    }
}
