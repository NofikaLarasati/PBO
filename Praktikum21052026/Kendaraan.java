/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum21052026;

/**
 *
 * @author LENOVO
 */
public abstract class Kendaraan {
    protected String noPolisi;

    public Kendaraan(String noPolisi) {
        this.noPolisi = noPolisi;
    }

    public String getNoPolisi() {
        return noPolisi;
    }

    public void setNoPolisi(String noPolisi) {
        this.noPolisi = noPolisi;
    }
    

    public void tampilData() {
        System.out.println("No Polisi : " + noPolisi);
    }
  
    public abstract void biayaRental();
}
