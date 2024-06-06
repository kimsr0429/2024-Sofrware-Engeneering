package designpattern.command.pokemon;

// 공격 커맨드 클래스
public class AttackCommand implements Command{
    private Pokemon pokemon;

    public AttackCommand(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void excute() {
        pokemon.attack();
    }
}
