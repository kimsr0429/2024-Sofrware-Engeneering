package designpattern.strategy;

public class Thunderbolt implements Weapon{
    @Override
    public void attack(Pokemon pokemon) {
        System.out.println(pokemon.getName() + "에게 썬더볼트를 시전합니다.");
    }
}
