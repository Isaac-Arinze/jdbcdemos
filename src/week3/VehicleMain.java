package week3;

public class VehicleMain {

    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "BMW";
        car.setNumberOfSeats(6);

        System.out.println(car);

        MotorCycle motorcycle = new MotorCycle();
        motorcycle.brand = "Honda";
        motorcycle.setHasSideCar(false);
        System.out.println(motorcycle);

    }
}
