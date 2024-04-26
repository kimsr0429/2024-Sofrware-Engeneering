package designpattern.factory.abstractFactoryMethod.electricCar;

public class TeslaBattery implements Battery {
    @Override
    public int getRange() {
        return 500;
    }
}
