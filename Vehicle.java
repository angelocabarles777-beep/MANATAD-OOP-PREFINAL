/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public abstract class Vehicle {
    private String vehicleID;
       private String brand;
       private String model;
       private int year;
       private int rentaldays;
       private static int vehiclecount = 0;
     
    public Vehicle() {
       vehiclecount++;
    }
    public Vehicle(String vehicleID,String brand, String model,int year,int rentaldays) {
      this.vehicleID = vehicleID;
      this.brand = brand;
      this.model = model;
      this.year = year;
      this.rentaldays = rentaldays;
      vehiclecount++;
    }
    public String getvehicleID() {return vehicleID;}
    public void setvehicleID(String vehicleID) {this.vehicleID = vehicleID;}
    public String getbrand() {return brand;}
    public void setbrand(String brand) {this.brand = brand;}
    public String getmodel() {return model;}
    public void setmodel(String model) {this.model = model;}
    public int getyear() {return year;}
    public void setyear(int year) {this.year = year;}
    public int getrentaldays() {return rentaldays;}
    public void setrentaldays(int rentaldays) { this.rentaldays = rentaldays;}
    
    
    public abstract double calculaterentalfee();
    
    public void displayvehicleinfo() {
        System.out.println("vehicleID : " + vehicleID);
        System.out.println("brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("year: " + year);
        System.out.println("rentaldays: " + rentaldays);
    }
     public void displayvehicleinfo(boolean showrentalfee) {
         displayvehicleinfo(); 
         if (showrentalfee) {
          System.out.printf("Rental Fee: PHP%.2f\n", calculaterentalfee());
        }
    }
     public static int getvehiclecount() {
       return vehiclecount;  
    }

    void displayvehicletype() {
        throw new UnsupportedOperationException(); 
    }
}
