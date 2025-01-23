package Interfaces;


enum FlightStages implements Trackable {GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if(this != GROUNDED){
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage(){
        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
    }
}
record DragonFly(String name, String type) implements FlightEnabled {

    @Override
    public void move() {

    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
class Satellite implements OrbitEarth {
    public void achieveOrbit(){
        System.out.println("Orbit achieved!");
    }

    @Override
    public void move() {

    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
interface OrbitEarth extends FlightEnabled {
    default void achieveOrbit(){
        System.out.println("Orbit achieved!");
    }
}
interface FlightEnabled {

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    default FlightStages transition(FlightStages stage) {
        //System.out.println("transition not implemented on " +
                 //this.getClass().getName());
        //return null;
        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }

    void move();
    void takeOff();
    void land();
    void fly();
}
interface Trackable {
    void track();
}



public abstract class Animal {

    public abstract void move();
}
