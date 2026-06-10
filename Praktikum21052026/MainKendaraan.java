/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum21052026;

/**
 *
 * @author LENOVO
 */
public class MainKendaraan {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        System.out.println("=== DATA MOBIL RINDIANI ===");

        Mobil mobil = new Mobil("BR 1369 NDI");
         mobil.tampilMobil();

        System.out.println("\n=== DATA MOTOR RINDIANI ===");

        Motor motor = new Motor("BS 6789 DNA");
        motor.tampilMotor();

        System.out.println("\n=== DATA BUS RINDIANI ===");

        Bus bus = new Bus("BP 09876 AU");
        bus.tampilBus();
    }
}
