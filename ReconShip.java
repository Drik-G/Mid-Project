public class ReconShip extends SpaceShip {
    //constructor. "super" passes data back to the parent class constructor
    public ReconShip(String name, int fuel, double integrity){
        super(name, fuel, integrity);
    }

    //runtime polymorphism. overriding the parents mission method
    @Override
    //Method
    public void performMission(){
        IO.println("[Scanner] " + getName() + " is actively mapping the surrounding.");
        setFuel(getFuel() - 15);
    }
}
