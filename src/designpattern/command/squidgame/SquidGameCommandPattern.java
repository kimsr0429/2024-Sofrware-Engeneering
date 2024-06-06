package designpattern.command.squidgame;

// 클라이언트
public class SquidGameCommandPattern {
    public static void main(String[] args) {
        // 인보커 객체 생성
        GameControl gameControl = new GameControl();

        // 구상 커맨드 객체 생성(리시버 없음)
        GameCommand mugunghwaGame = new MugunghwaGame();
        GameCommand dalgonaGame = new DalgonaGame();
        GameCommand tugOfWarGame = new TugOfWarGame();

        // 인보커에 커맨드 등록, 커맨드 실행(execute)
        gameControl.setGameCommand(mugunghwaGame);
        gameControl.startGame();
        gameControl.setGameCommand(dalgonaGame);
        gameControl.startGame();
        gameControl.setGameCommand(tugOfWarGame);
        gameControl.startGame();
    }
}
