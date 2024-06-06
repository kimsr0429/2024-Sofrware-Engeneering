package designpattern.adapter.digiPokemon;

public class DigimonAdapter implements Pokemon{
    Digimon digimon;

    public DigimonAdapter(Digimon digimon) {
        this.digimon = digimon;
    }

    @Override
    public void attack() {
        digimon.attackAnemy();
    }

    @Override
    public void defend() {
        digimon.protectMaster();
    }
}
