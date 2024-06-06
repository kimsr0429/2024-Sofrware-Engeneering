package designpattern.command.squidgame.shortCommand;

// 인보커 클래스
public class GameControl {
    private GameCommand gameCommand;

    public void setGameCommand(GameCommand gameCommand) {
        this.gameCommand = gameCommand;
    }

    public void startGame() {
        System.out.println("게임을 시작합니다.");
        gameCommand.execute();
    }
}
