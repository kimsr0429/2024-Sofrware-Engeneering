package designpattern.command.pokemon;

// 방어 커맨드 클래스
public class DefendCommand implements Command{
    private Pokemon pokemon;

    public DefendCommand(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void excute() {
        pokemon.defend();
    }
}
