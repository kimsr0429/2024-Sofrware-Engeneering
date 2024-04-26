package designpattern.factory.abstractFactoryMethod.electricCar;

public class HyundaiFactory implements CarFactory {
    @Override
    public ElectricMotor createMotor(){
        return new HyundaiMotor();
    }
    @Override
    public Battery createBattery() {
        return new HyundaiBattery();
    }
}
