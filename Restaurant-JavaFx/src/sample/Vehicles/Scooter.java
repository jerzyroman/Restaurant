package sample.Vehicles;

/**
 * Created by Master Faster on 05.12.2016.
 */
public class Scooter extends Vehicle {
    @Override
    public String stringIntroduction(){
        return "Scooter " + super.stringIntroduction();
    }
}
