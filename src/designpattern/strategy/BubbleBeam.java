package designpattern.strategy;

public class BubbleBeam implements Weapon{
    @Override
    public void attack(Pokemon pokemon) {
        System.out.println(pokemon.getName() + "에게 물대포를 발사합니다.");
    }
}
