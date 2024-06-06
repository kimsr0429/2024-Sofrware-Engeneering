package designpattern.command.squidgame;

// 커맨드 인터페이스
@FunctionalInterface
public interface GameCommand {
    void execute();
}
