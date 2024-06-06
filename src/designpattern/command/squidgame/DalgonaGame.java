package designpattern.command.squidgame;

// 구상 커맨드
public class DalgonaGame implements GameCommand{
    @Override
    public void execute() {
        System.out.println("달고나 게임 시작!");
    }
}
