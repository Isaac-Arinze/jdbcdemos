package car_Rental_Project;

public class Rental {

    private Car car; // composition

    private Customer customer;
    private int days;

    public Rental(Car car, Customer customer, int days) {
        this.car = car;
        this.customer = customer;
        this.days = days;
    }

    public Car getCar(){
        return car;
    }

    public Customer getCustomer(){
        return customer;
    }
    public int getDays(){
        return days;
    }


}
