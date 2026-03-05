/*
    Cow
*/
public class ElectricCar extends Vehicle {

    private double batteryPercent;

    public ElectricCar(String model) {
        // TODO: Use super() to set the model

        //This is refearing back to the modifier Constuctor in the Parent Class (Vehicle) and getting the model there and converting it to the model here specifically for an Electric Car.
        //The Parent Class constructor has a parameter, and the extention class must match Identically. So this constructor must have a parameter being called to as well to be able to override it.
        super(model);

        // TODO: Set batteryPercent to 100.0
        batteryPercent = 100.0;
    }

    /**
     * Override drive: Decreases battery by 1% for every 5 miles driven.
     */
    @Override

    //Every five miles the battery decrease by one.
    //void method, no return line.
    public void drive(int distance) {
        // TODO: Call super.drive()

        //The Parent Class mothed has a parameter as well. So the extention method must have a parameter too because the original is expecting one to be entered.
        super.drive(distance);

        // TODO: Calculate battery loss

        //Worse case first, batter is died.
        //If the percentage of the battery subtracted from the distance and dived by 5 miles is less then zero,
        //the battery has died.
        //An (int) divided by a double equals a double. So batterPercent will equal a double still at the end. Nothing will change.
        if((batteryPercent -= distance/5.0) < 0)
            batteryPercent = 0;
        //The battery has not died, so take 1% for every five miles. 
        else
            batteryPercent -= distance/5.0;
        
    }

    //Do I need to charge???
    public void charge()
    {
        batteryPercent = 100.0;
    }

    public double getBattery()
    {
        return batteryPercent;
    }

    //Need a toString() to check if functions
    public String toString()
    {
        return "" + "The battery percent is  " + batteryPercent;
    }
}
