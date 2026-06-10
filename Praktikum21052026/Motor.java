/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum21052026;

/**
 *
 * @author LENOVO
 */
public class Motor extends Kendaraan{
    double biaya = 250000;

    public Motor(String noPolisi) {
        super(noPolisi);
    }

    public double getBiaya() {
        return biaya;
    }

    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }
    
   public void tampilMotor(){
        tampilData();
        System.out.println("Biaya Rental Motor : " + biaya);
    }

    @Override
   public  void biayaRental() {
    }
}
