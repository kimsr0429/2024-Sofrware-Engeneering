package designpattern.command.pokemon;

// 리시버 클래스
public class Pokemon {
    private String name;

    public Pokemon(String name){
        this.name = name;
    }
    public void attack(){
        System.out.println(name + "가 공격합니다!");
    }
    public void defend(){
        System.out.println(name + "가 방어합니다!");
    }
}
