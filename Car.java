import java.util.ArrayList;

public class Car {
    private ArrayList<Passenger> passList = new ArrayList<Passenger>();
    private int capacity;

    public Car(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Gets the capacity of the car and prints the capacity
     * 
     * @return int, capacity of the car
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Calculates the remaining empty seats in the car
     * 
     * @return int, the remaining seats in the car
     */
    public int seatsRemaining() {
        int seatsRem = this.capacity - this.passList.size();
        return seatsRem;
    }

    /**
     * Adds passenger to the car
     * 
     * @param p one passenger object from the Passenger class
     * @return boolean, whether or not the passenger was added
     */
    public boolean addPassenger(Passenger p) {
        if (this.passList.size() <= this.capacity) {
            if (this.passList.contains(p)) {
                System.out.println("Passenger is already on this car.");
                return false;
            } else {
                this.passList.add(p);
                System.out.println("Successfully added");
                return true;
            }
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
        if (this.passList.contains(p)) {
            this.passList.remove(p);
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
        if (this.passList.isEmpty()) {
            System.out.println("This car is EMPTY");
        } else {
            System.out.println("Here are the passengers aboard this car: ");
            for (int i = 0; i < this.passList.size(); i++) {
                Passenger passenger = this.passList.get(i);
                System.out.println(passenger.getName());
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
        System.out.println(myCar.getCapacity());
        System.out.println(myCar.seatsRemaining());
        myCar.printManifest();
    }
}