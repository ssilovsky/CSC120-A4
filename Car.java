//The `Car` class (`Car.java`) will be used as a container for `Passenger` objects

import java.util.ArrayList;

public class Car {
    ArrayList carList;
    int capacity;

    public Car(int capacityIn){
        carList = new ArrayList(capacityIn);
        capacity = capacityIn;
    }

    public int getCapacity(){
        return capacity;
    }
    
    public int seatsRemaining(){


    }

    public boolean addPassenger(Passenger p){

    }

    public boolean removePassenger(Passenger p){

    }

    public ArrayList printManifest(){

    }

    public static void main(String[] args) {
        Car myCar = new Car(10);
    }
}