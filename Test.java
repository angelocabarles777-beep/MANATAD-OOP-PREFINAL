/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class Test {
    public static void displayHeader() {
    System.out.println("===================================================");
    System.out.println("DINA AND GAT RENT RIDE SERVICE");
    System.out.println("VEHICLE RENTAL");
    System.out.println("===================================================");
    }
    public static void displayVehicle(Vehicle v) {
        v.displayvehicleinfo();
        v.displayvehicletype();
        System.out.printf("Rental Fee: PHP5.2f\n", v.calculaterentalfee());
        System.out.println("\n=========================================");
    }
    public static void displaySummary(double totalFees) {
       System.out.println("================================================");
       System.out.println("Total Vehicle: "+ Vehicle.getvehiclecount());
       System.out.printf("Total Rent Fees: PHP %.2f\n",totalFees);
       System.out.println("===============================================");
    }
    public static void main(String[] args) {
       displayHeader();
       
       Sedan sedan = new Sedan("SD001","TOYOTA","VIOS",2004, 310500);
       Van van = new van ("VN001", "TOYOTA","HIGHACE",2005, 423546534);
    }
}
