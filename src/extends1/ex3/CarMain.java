package extends1.ex3;

public class CarMain {

    public static void main(String[] args) {

        Car car = new Car();
        car.move();
        car.openDoor();

        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        HydrogenCAr hydrogenCAr = new HydrogenCAr();
        hydrogenCAr.move();
        hydrogenCAr.fillHydrogen();
        hydrogenCAr.openDoor();

    }
}
