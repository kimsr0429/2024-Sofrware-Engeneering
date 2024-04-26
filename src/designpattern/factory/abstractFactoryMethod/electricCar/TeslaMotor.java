package designpattern.factory.abstractFactoryMethod.electricCar;

public class TeslaMotor implements ElectricMotor {
    @Override
    public void start() {
        System.out.println("테슬라 모터 구동 시작~");
    }
}
