public class Main {
    public static void main(String[] args) {
        //Creating real world instances of the subclasses
        //Instance(the actual object)
        ReconShip explorer = new ReconShip("Star-X", 100, 100);
        CargoShip hauler = new CargoShip("Bob-0", 100, 100);

        //Displaying the initial states
        System.out.println("=== INITIAL STATUS ===");
        System.out.println("Ship: " + explorer.getName() + " | Fuel: " + explorer.getFuel() + "%");
        System.out.println("Ship: " + hauler.getName() + " | Fuel: " + hauler.getFuel() + "%");
        System.out.println();

        //runtime polymorphism (Method Overriding).
        //Both ships call the exact same method name, but execute different things
        System.out.println("=== DEPLOYING ON A STANDARD MISSIONS ===");
        explorer.performMission();
        hauler.performMission();
        System.out.println();

        //runtime polymorphism (Method Overloading.
        //Calling the version of the method that takes an integer parameter for a Space jump
        System.out.println("=== PERFORMING A SPACE JUMP ===");
        explorer.performMission(12);
        hauler.performMission(5);
        System.out.println();

        System.out.println("=== FINAL STATUS ===");
        System.out.println("Ship: " + explorer.getName() + " | Fuel: " + explorer.getFuel() + "%");
        System.out.println("Ship: " + hauler.getName() + " | Fuel: " + hauler.getFuel() + "%");
    }
}
