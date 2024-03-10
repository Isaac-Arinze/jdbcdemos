package week3;

public class VehicleMain {

    public static void main(String[] args) {
        Cars cars = new Cars();
        cars.brand = "BMW";
        cars.setNumberOfSeats(6);

        System.out.println(cars);

        MotorCycle motorcycle = new MotorCycle();
        motorcycle.brand = "Honda";
        motorcycle.setHasSideCar(false);
        System.out.println(motorcycle);

    }
}
