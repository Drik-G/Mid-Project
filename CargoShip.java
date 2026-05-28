public class CargoShip extends SpaceShip {
    //constructor. "super" passes data back to the parent class constructor
    public CargoShip(String name, int fuel, double integrity){
        super(name, fuel, integrity);
    }

    //runtime polymorphism. overriding the parents mission method differently
    @Override
    //Method
    public void performMission(){
        IO.println("[Cargo] " + getName() + " is actively moving minerals.");
        setFuel(getFuel() - 25);
    }
}
