package car_Rental_Project;

import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRentalSystem {

    private List<Car> cars;

    private List<Customer> customers;
    private List<Rental> rentals;

    public CarRentalSystem() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void rentCar(Car car, Customer customer, int days) {
        if (car.isAvailable()) {
            car.rent();
            rentals.add(new Rental(car, customer, days));
        } else {
            System.out.println("Car is not available for rent");
        }

    }

    public void rentCar(Car car) {
        car.returnCar();
        Rental rentalToRemove = null;

        for (Rental rental : rentals){
            if(rental.getCar() == car){
                rentalToRemove = rental;
                break;
            }
        }
        if(rentalToRemove != null){
            rentals.remove(rentalToRemove);
            System.out.println("car returned successfully.");

        }else {
            System.out.println("car was not rented.");
        }

    }
    public void menu(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("-------Car Rental System=====");
        }
    }
}
