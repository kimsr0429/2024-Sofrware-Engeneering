package designpattern.strategy;

public class Nofly implements Fly{
    @Override
    public void fly() {
        System.out.println("날 수 없습니다.");
    }
}
