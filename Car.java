import java.util.ArrayList;

public class Car {
    ArrayList<Passenger> passList = new ArrayList<Passenger>();
    int capacity;

    public Car(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Gets the capacity of the car and prints the capacity
     * 
     * @return int, capacity of the car
     */
    public int getCapacity() {
        System.out.println("Capacity is " + capacity);
        return capacity;
    }

    /**
     * Calculates the remaining empty seats in the car
     * 
     * @return int, the remaining seats in the car
     */
    public int seatsRemaining() {
        int seatsRem = capacity - passList.size();
        System.out.println("There are " + seatsRem + " seats remaining.");
        return seatsRem;
    }

    /**
     * Adds passenger to the car
     * 
     * @param p one passenger object from the Passenger class
     * @return boolean, whether or not the passenger was added
     */
    public boolean addPassenger(Passenger p) {
        if (passList.size() <= capacity) {
            passList.add(p);
            System.out.println("Successfully added");
            return true;
        } else {
            System.out.println("Couldn't add");
            return false;
        }
    }

    /**
     * Removes passenger to the car
     * 
     * @param p one passenger object from the Passenger class
     * @return boolean, whether or not the passenger was removed
     */
    public boolean removePassenger(Passenger p) {
        if (passList.contains(p)) {
            passList.remove(p);
            System.out.println("Successully removed");
            return true;
        } else {
            System.out.println("Couldn't remove passenger");
            return false;
        }
    }

    /**
     * Prints the names of the passengers in the car
     */
    public void printManifest() {
        if (passList.isEmpty()) {
            System.out.println("This car is EMPTY");
        } else {
            System.out.println("Here are the passengers aboard this car: ");
            for (int i = 0; i < passList.size(); i++) {
                Passenger passenger = passList.get(i);
                System.out.println(passenger.name);
            }
        }

    }

    public static void main(String[] args) {
        // examples and tests of Car class
        Car myCar = new Car(10);
        Passenger p = new Passenger("Jared");
        Passenger w = new Passenger("Jo");
        myCar.addPassenger(p);
        myCar.addPassenger(w);
        myCar.getCapacity();
        myCar.seatsRemaining();
        myCar.printManifest();
    }
}