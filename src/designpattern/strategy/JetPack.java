package designpattern.strategy;

public class JetPack implements Fly {
    @Override
    public void fly() {
        System.out.println("제트팩을 타고 날아갑니다.");
    }
}
