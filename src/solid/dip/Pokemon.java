package solid.dip;

public class Pokemon implements Battleable{

    @Override
    public void attack() {
        System.out.println("공격!!");
    }
}
