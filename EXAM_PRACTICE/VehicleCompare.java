/*
 * 3. Write a Java program to create a vehicle class hierarchy in which base class is an abstract class ‘Vehicle’ 
 * with member variables wheels, company, year and fuel, an abstract method ‘calcFuelUsage’ and a method display 
 * to show the name of the class with subclasses are Car and Motorcycle. Each subclass has 2 final fields maximum 
 * speed= 190 kmph and 110 kmph and Mileage=15 km/L and 37 km/L in respective classes. Assume that both vehicles 
 * travelled in its max speed then find out the amount of fuel used for travelling 1000 km and distance covered in 
 * 90 minutes. Write the output into the file called ‘vehiclecompare.txt’, which take as command line argument in 
 * your program.
 */

import java.io.File;
import java.io.FileOutputStream;

abstract class Vehicle{
    int wheels;
    String company;
    int year;
    String fuel;
    int fuelRequired;
    double distanceTraveled;
    abstract void calcFuelUsage();
    void display(){
        System.out.println(this.getClass());
    }
}

class Car extends Vehicle{

    final int max_speed = 190;
    final int milage = 15;

    void calcFuelUsage(){
        fuelRequired = 1000*milage;
        distanceTraveled = max_speed*1.5;
    }

    Car(){
        this.company = "Ford";
        this.wheels = 4;
        this.year = 2020;
        this.fuel = "Diesel";        
    }
}

class Motorcycle extends Vehicle{
    final int max_speed = 110;
    final int milage = 37;
    void calcFuelUsage(){
        fuelRequired = 1000*milage;
        distanceTraveled = max_speed*1.5;
    }
    Motorcycle(){
        this.company = "Royal Enfield";
        this.wheels = 2;
        this.year = 2009;
        this.fuel = "Petrol";
    }
    void display(){
        System.out.println(super.getClass());
        super.display();
    }
}


public class VehicleCompare {
    public static void main(String[] args) {
        File file = new File(args[0]);
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        StringBuilder toWrite = new StringBuilder();
        
        toWrite.append("Base Class : "+car.getClass().getSuperclass().getName()+"\n");

        toWrite.append("SubClass : "+car.getClass().getName()+"\n");
        toWrite.append("Wheels : "+car.wheels+"\n");
        toWrite.append("Company : "+car.company+"\n");
        toWrite.append("Year : "+car.year+"\n");
        toWrite.append("Fuel : "+car.fuel+"\n");
        car.calcFuelUsage();
        toWrite.append("Fuel Required for 1000 km : "+car.fuelRequired+"\n");
        toWrite.append("Distance Traveled in 90 minutes : "+car.distanceTraveled+"\n");
        toWrite.append("\n");
        toWrite.append("SubClass : "+motorcycle.getClass().getName()+"\n");
        toWrite.append("Wheels : "+motorcycle.wheels+"\n");
        toWrite.append("Company : "+motorcycle.company+"\n");
        toWrite.append("Year : "+motorcycle.year+"\n");
        toWrite.append("Fuel : "+motorcycle.fuel+"\n");
        motorcycle.calcFuelUsage();
        toWrite.append("Fuel Required for 1000 km : "+motorcycle.fuelRequired+"\n");
        toWrite.append("Distance Traveled in 90 minutes : "+motorcycle.distanceTraveled+"\n");


        try{
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(toWrite.toString().getBytes());
            fos.close();
        }
        catch(Exception e){
            System.out.println(e);
        }



        System.err.println(toWrite);
    }
}
