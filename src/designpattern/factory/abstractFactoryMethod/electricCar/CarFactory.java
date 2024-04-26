package designpattern.factory.abstractFactoryMethod.electricCar;

interface CarFactory {
    ElectricMotor createMotor();
    public Battery createBattery();
}
