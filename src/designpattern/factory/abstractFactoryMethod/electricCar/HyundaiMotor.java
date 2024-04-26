package designpattern.factory.abstractFactoryMethod.electricCar;

public class HyundaiMotor implements ElectricMotor {
    @Override
    public void start() {
        System.out.println("현대차 모터 구동 시작~");
    }
}
