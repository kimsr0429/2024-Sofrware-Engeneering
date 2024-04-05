package designpattern.strategy;

public class Pikachu extends Pokemon{

    public Pikachu(String name, int level, int hp, Weapon weapon, Fly fly) {
        super(name, level, hp, weapon, fly);
        sayHello();
    }
    @Override
    public void sayHello() {
        System.out.println("피카피카!");
    }
}
