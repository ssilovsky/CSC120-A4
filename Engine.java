public class Engine {
    private FuelType fuel;
    private double currentLevel;
    private double maxLevel;
    private boolean notEmpty;

    public Engine(FuelType fuel, double currentLevel, double maxLevel, boolean notEmpty) {
        this.fuel = fuel;
        this.currentLevel = currentLevel;
        this.maxLevel = maxLevel;
        this.notEmpty = notEmpty;
    }

    /**
     * refuels the engine to max fuel
     */
    public void refuel() {
        this.currentLevel = this.maxLevel;
    }

    /**
     * Moves the train by a unit of 1 and prints fuel level
     * 
     * @return bullean, states whether the fuel tank is empty
     */
    public boolean go() {
        this.currentLevel -= 1;
        System.out.println("Fuel level is " + this.currentLevel);
        return this.currentLevel >= 1;
    }

    public static void main(String[] args) {
        // examples and tests for the Engine class
        Engine myEngine = new Engine(FuelType.STEAM, 50.0, 100.0, true);

        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");

    }
}