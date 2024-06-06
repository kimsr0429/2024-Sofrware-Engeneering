package designpattern.command.pokemon;

// 인보커 클래스
public class Game {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }
    public void play(){
        command.excute();
    }
}
