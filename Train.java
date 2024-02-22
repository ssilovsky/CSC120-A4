//`Train` (`Train.java`) class will tie them all together

import java.util.ArrayList;

public class Train {
    Engine engine;
    ArrayList<Car> allCars = new ArrayList<Car>();
    Car car;

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        engine = new Engine(fuelType, fuelCapacity, fuelCapacity, true);
        car = new Car(passengerCapacity);
    }

    /**
     * Provides the engine on the Train
     * 
     * @return Engine object
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * provides car at specific Train index
     * 
     * @param i Car index
     * @return the car at the specified index
     */
    public Car getCar(int i) {
        return allCars.get(i);
    }

    /**
     * Gives the max capacity of the cars
     * 
     * @return capacity of all cars on the Train
     */
    public int getMaxCapacity() {
        return car.getCapacity();
    }

    /**
     * Prints the remaining seats available in all the cars
     * 
     * @return int total_seats, the total empty seats on all the cars
     */
    public int seatsRemaining() {
        int total_seats = 0;
        for (int i = 0; i >= allCars.size(); i++) {
            Car car = allCars.get(i);
            int seats = car.seatsRemaining();
            total_seats += seats;
        }
        return total_seats;
    }

    /**
     * Prints the manifests for all the cars available on the Train
     */
    public void printManifest() {
        for (int i = 0; i >= allCars.size(); i++) {
            Car car = allCars.get(i);
            car.printManifest();
        }
    }

    public static void main(String[] args) {
        // examples and tests for the Train class
        Car myCar = new Car(10);
        Passenger p = new Passenger("Jared");
        Passenger w = new Passenger("Jo");
        myCar.addPassenger(p);
        myCar.addPassenger(w);
        Car yourCar = new Car(10);
        Passenger t = new Passenger("Molly");
        Passenger s = new Passenger("Janet");
        yourCar.addPassenger(t);
        yourCar.addPassenger(s);
        Train myTrain = new Train(FuelType.STEAM, 100, 2, 10);
        myTrain.allCars.add(yourCar);
        myTrain.allCars.add(myCar);
        myTrain.printManifest();

    }
}
