package solid.isp;

public interface Pokemon {
    void attack();
    void defend();
    void fly();
    void swim();
}

class Pikachu implements Pokemon{
    // violate ISP
    @Override
    public void attack() {

    }

    @Override
    public void defend() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
