/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum21052026;

/**
 *
 * @author LENOVO
 */
public class Mobil extends Kendaraan{
    int  biayaRental = 500000;

    public Mobil(String noPolisi) {
        super(noPolisi);
    }

    public double getBiayaRental() {
        return biayaRental;
    }

    public void setBiayaRental(double biayaRental) {
        this.biayaRental = (int) biayaRental;
    }
    
    public void tampilMobil(){
        tampilData();
        System.out.println("Biaya Rental Mobil : " + biayaRental);
    }

    @Override
    public void biayaRental() {
    }
}
