package designpattern.strategy;

public class PokemonsterGame {
    public static void main(String[] args) {
        System.out.println("포켓몬스터 게임을 시작합니다!");

        Weapon thunderbolt = new Thunderbolt();
        Weapon flameThrower = new FlameThrower();
        Weapon bubbleBeam = new BubbleBeam();

        Fly jetPack = new JetPack();
        Fly noFly = new Nofly();
        Fly wings = new Wings();

        Pokemon charizard = new Charizard("리자몽키", 1, 150, flameThrower, wings);
        Pokemon pikachu = new Pikachu("피카츄러스", 1, 120, thunderbolt, noFly);
        Pokemon squirtle = new Squirtle("꼬북칩", 1, 100, bubbleBeam, jetPack);

        pikachu.performAttack(charizard);
        charizard.performAttack(pikachu);

        squirtle.performAttack(charizard);
        charizard.performAttack(squirtle);
        squirtle.performFly();

        charizard.evolve();
        charizard.performFly();
        charizard.performAttack(pikachu);

        squirtle.evolve();
        squirtle.performAttack(charizard);

        System.out.println("게임을 종료합니다.");
    }
}
