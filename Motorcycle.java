/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public abstract class Motorcycle extends Vehicle {
    private double dailyrate;
    private double helmetfee;
    
      public Motorcycle (String vehicleID,String brand, String model,int year,int rentaldays,double dailyrate ,double helmetfee) {
      super (vehicleID, brand, model, year, rentaldays);
      this.dailyrate = dailyrate;
      this.helmetfee = helmetfee;
    }
   
      public double calcuterentalfee() {
      return (getrentaldays()*dailyrate) + helmetfee;  
    }
      public void displayvehicletype() {
          System.out.println("Vehicle Type:Motorcycle");
    }
}
