package week3;

public class Vehicle {
    protected String brand;

    public void drive(){
        System.out.println("Driving the Vehicle");
    }
}

class Cars extends Vehicle{
    private int numberOfSeats;

    public int getNumberOfSeats() {
        return numberOfSeats
                ;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void drive() {
        System.out.println("Driving the Car");
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfSeats=" + numberOfSeats +
                ", brand='" + brand + '\'' +
                '}';
    }
}

class MotorCycle extends Vehicle {
    private boolean hasSideCar;

    public boolean hasSideCar(){
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar){
        this.hasSideCar = hasSideCar;
    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                "hasSideCar=" + hasSideCar +
                ", brand='" + brand + '\'' +
                '}';
    }
}