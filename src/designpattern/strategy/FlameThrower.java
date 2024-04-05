package designpattern.strategy;

public class FlameThrower implements Weapon{
    @Override
    public void attack(Pokemon pokemon) {
        System.out.println(pokemon.getName() + "에게 화염방사를 발사합니다.");
    }
}
