public class SpaceShip {
    private String name;
    private int fuel;
    private double integrity;

    //constructor(initialize objects i guess)
    public SpaceShip(String name, int fuel, double integrity){
        this.name = name;
        this.fuel = fuel;
        this.integrity = integrity;
    }

    //Getter
    public String getName() {
        return name;
    }

    public int getFuel() {
        return fuel;
    }

    public double getIntegrity() {
        return integrity;
    }

    //Setter
    public void setFuel(int fuel){
        if(fuel < 0){
            this.fuel = 0;
        }else if(fuel > 100){
            this.fuel = 100;
        }else{
            this.fuel = fuel;
        }
    }
    public void setIntegrity(double integrity){
        if(integrity < 0){
            this.integrity = 0;
        }else if(integrity > 100){
            this.integrity = 100;
        }else{
            this.integrity = integrity;
        }
    }

    //Mission A: standard cruise
    //Method(does something when called)
    public void performMission(){
        IO.println(this.name + " is on a standard cruise.");
        setFuel(this.fuel - 10);
    }
    //Mission B:hyper jump (method overloading)
    //Method
    public void performMission(int lightYears){
        IO.println(this.name + " is on a space jump across " + lightYears + " light years.");
        setFuel(this.fuel - (lightYears * 2));
    }
}