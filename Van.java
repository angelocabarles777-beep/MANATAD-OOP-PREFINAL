/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public abstract class Van extends Vehicle {
    private final double dailyrate;
    private final double insurancefee;
    
      public Van(String vehicleID,String brand, String model,int year,int rentaldays,double dailyrate ,double insurancefee) {
      super (vehicleID, brand, model, year, rentaldays);
      this.dailyrate = dailyrate;
      this.insurancefee = insurancefee;
    }
   
      public double calcuterentalfee() {
      return (getrentaldays()*dailyrate) + insurancefee;  
    }
      public void displayvehicletype() {
        System.out.println("Vehicle Type:Van");
    }
}
