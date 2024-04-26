package designpattern.factory.abstractFactoryMethod.electricCar;

public class TeslaFactory implements CarFactory {
    @Override
    public ElectricMotor createMotor(){
        return new TeslaMotor();
    }
    @Override
    public Battery createBattery() {
        return new TeslaBattery();
    }
}
