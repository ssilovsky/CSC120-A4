public class Passenger {

    // changed to public because I could not access the passenger's name for
    // printManifest()
    String name;

    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Boards Passenger to Car
     * 
     * @param c Car object
     */
    public void boardCar(Car c) {
        c.addPassenger(this);
    }

    /**
     * Removes Passenger from Car
     * 
     * @param c Car object
     */
    public void getOffCar(Car c) {
        c.removePassenger(this);
    }

    public static void main(String[] args) {
        // examples and tests for Passenger class
        Car myCar = new Car(10);
        Passenger p = new Passenger("Jared");
        p.boardCar(myCar);
        p.getOffCar(myCar);

    }
}
