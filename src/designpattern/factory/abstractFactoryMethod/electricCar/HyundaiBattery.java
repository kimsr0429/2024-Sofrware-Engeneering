package designpattern.factory.abstractFactoryMethod.electricCar;

public class HyundaiBattery implements Battery {
    @Override
    public int getRange() {
        return 501;
    }
}
