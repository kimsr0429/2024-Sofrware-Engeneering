package solid.dip;

public class Trainer {
    private final Battleable battleable;

    public Trainer(Battleable battleable) {
        this.battleable = battleable;
    }

    public void catchPokemon() {
        System.out.println("포켓몬을 잡았다!");
    }

    public void battle() {
        battleable.attack();
    }
}
