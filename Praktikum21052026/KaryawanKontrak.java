/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum21052026;

/**
 *
 * @author LENOVO
 */
public class KaryawanKontrak extends Karyawan{
    double honorKontrak;
    double uangMakan = 300000;

    public KaryawanKontrak(double honorKontrak, String nik, String nama) {
        super(nik, nama);
        this.honorKontrak = honorKontrak;
    }

   public void tampilKontrak() {
        tampilData();

        System.out.println("Honor Kontrak : " + honorKontrak);
        System.out.println("Uang Makan    : " + uangMakan);
        System.out.println("Total Gaji    : " + (honorKontrak + uangMakan));
    }
}
