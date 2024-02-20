public class Engine {
    FuelType fuel;
    double currentLevel;
    double maxLevel; 
    boolean notEmpty;

    public Engine(FuelType fuelIn, double currentLevelIn, double maxLevelIn, boolean notEmptyIn) {
        fuel = fuelIn;
        currentLevel = currentLevelIn;
        maxLevel = maxLevelIn;
        notEmpty = notEmptyIn;
    }

    public void refuel() {
        currentLevel = maxLevel;
    }

    public boolean go() {
        currentLevel -= 1;
        System.out.println("Fuel level is " + currentLevel);
        if (currentLevel >= 0){
            notEmpty = true;
        } else{
            notEmpty = false;
        }
        return notEmpty; 
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.STEAM, 50.0, 100.0, true);

        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");

    }
}