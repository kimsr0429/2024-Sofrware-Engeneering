package designpattern.adapter.digiPokemon;

public class Pikachu implements Pokemon{
    @Override
    public void attack() {
        System.out.println("백만볼트~!");
    }

    @Override
    public void defend() {
        System.out.println("금강불괴!");
    }
}
