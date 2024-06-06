package designpattern.command.squidgame;

// 구상 커맨드
public class TugOfWarGame implements GameCommand {
    @Override
    public void execute() {
        System.out.println("줄다리기 게임 시작!");
    }
}
