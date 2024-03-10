package car_Rental_Project;

public class CarRentalMain {

    public static void main(String[] args) {
        CarRentalSystem carRentalSystem = new CarRentalSystem();

        Car car1 = new Car("D001", "BMW", "camry", 100);
        Car car2 = new Car("C002", "Mercedez", "GLE", 1200);
        Car car3 = new Car("C003" , "Toyota", "Jeep", 4200);
        carRentalSystem.addCar(car1);
        carRentalSystem.addCar(car2);
        carRentalSystem.addCar(car3);

        carRentalSystem.menu();

    }
}
