/*
    Animal File.
    PULL FROM ANIMAL FARM!!!!
*/
public class Vehicle
{
    private String model;
    private int mileage;
    private boolean engineRunning;
    
    /**
     * Constructor: All vehicles start with 0 miles and engine off.
     */

    //Defualt Constuctor: Assigns defulat values
    public Vehicle()
    {
        model = "";
        mileage = 0;
        engineRunning = false; 
    }

    //Modifier Constructor: Assigns values to all instance varibles and instantiates all objects. 
    public Vehicle(String model)
    {
        // TODO: Initialize variables
        this.model = model;
    }

    //void method, has no return line. 
    public void startEngine() 
    {
        // TODO: Set engineRunning to true
         engineRunning = true;
    }

    /**
     * "Increase age"
     * Increases mileage if the engine is running.
     */
    public void drive(int distance) {
        // TODO: Logic to add distance only if engineRunning is true

        //If engine is running, accumulate mileage with the distance put in.
        if(engineRunning)
        {
            mileage+= distance;
        }
    }

    //Accesser Method
    public int getMileage()
    { 
        retrun mileage;
    }

    public String toString() {
        // TODO: Return model, mileage, and status
        return "" + "The model was " + model + ". " + "Its mileage is " + mileage + ". " + "Its status is " + engineRunning + ". ";
    }
}
