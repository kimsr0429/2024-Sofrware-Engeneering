package solid.ocp;

public class Pikachu extends Pokemon {
    public Pikachu(String name, int level, int hp) {
        super(name, level, hp);
        System.out.println("피카피카");
    }

    @Override
    public void attack() {
        System.out.println(getName() + "이(가) 100만볼트로 공격합니다");
    }

    @Override
    public void evolve() {
        hp += 30;
        level++;
        System.out.println(getName() + "이(가) 레벨 " + level + "(으)로 Up, 체력은 " + hp + "(으)로 증가함");
    }
}
