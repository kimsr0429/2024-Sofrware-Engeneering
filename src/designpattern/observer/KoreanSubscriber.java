package designpattern.observer;

public class KoreanSubscriber implements Subscriber{
    private String name;
    private int value;
    private LandCh landCh; // Arrgegation (has-a)

    public KoreanSubscriber(String name, LandCh landCh){
        this.name = name;
        this.landCh = landCh;
        landCh.registerSubscriber(this);
    }
    @Override
    public void update() {
        this.value = landCh.getPrice(); // pull
        System.out.println(name + "님 가격이 " + value + "원으로 변경되었습니다.");
    }
}
