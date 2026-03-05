/*
    Farm
*/

import java.util.ArrayList;

public class Dealership 
{
    public static void main(String[] args) 
    {
        ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();

        // TODO: Add a standard Vehicle and an ElectricCar
        inventory.add(new Vehicle());
        inventory.add(new ElectricCar());
        
        System.out.println("--- End of Day Report ---");

        // TODO: Loop through inventory. 
        for(Vehicle x: inventory)
        {
            // TODO: If a vehicle is an ElectricCar, check if it needs a charge.
            if(x instanceof ElectricCar)
            {
                System.out.println(((ElectricCar)x).getBattery() < 50);
                System.out.println(((ElectricCar)x).getcharge());
            }
        }

/*
    Do this here
    getbattery() < 50.0
    getcharge()
    //Instance of
*/
    }
}
