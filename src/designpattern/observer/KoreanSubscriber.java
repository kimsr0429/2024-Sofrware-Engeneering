package designpattern.observer;

public class KoreanSubscriber implements Subscriber{
    private String name;
    private int value;
    private LandCh landch; // Arrgegation (has-a)

    public KoreanSubscriber(String name, LandCh landch){
        this.name = name;
        this.value = value;
        landch.registerSubscriber(this);
    }
    @Override
    public void update(int value) {
        this.value = value;
        System.out.println(name + "님 가격이 " + value + "원으로 변경되었습니다.");
    }
}
