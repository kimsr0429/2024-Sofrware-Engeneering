package designpattern.adapter.digiPokemon;

public class Agumon implements Digimon{
    @Override
    public void attackAnemy() {
        System.out.println("화염방사~~");
    }

    @Override
    public void protectMaster() {
        System.out.println("주인을 지킵니다!");
    }
}
