/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum21052026;

/**
 *
 * @author LENOVO
 */
public class Bus extends Kendaraan{
    double biaya = 800000;

    public double getBiaya() {
        return biaya;
    }

    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }

    public Bus(String noPolisi) {
        super(noPolisi);
    }
    
    

    public void tampilBus(){
        tampilData();
        System.out.println("Biaya Rental Bus : " + biaya);
    
    }

    @Override
    public void biayaRental() {
      
    }
}
