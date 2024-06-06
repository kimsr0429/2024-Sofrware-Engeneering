package designpattern.command.squidgame;

// 구상 커맨드
public class MugunghwaGame implements GameCommand{
    @Override
    public void execute() {
        System.out.println("무궁화 꽃이 피었습니다 게임 시작!");
    }
}
