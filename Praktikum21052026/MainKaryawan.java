/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum21052026;

/**
 *
 * @author LENOVO
 */
public class MainKaryawan {
    public static void main(String[] args) {

    System.out.println("=== KARYAWAN TETAP ===");
    
    KaryawanTetap karyawantetap = new KaryawanTetap(3, 0, 0, "12345678", "Rindiani");
   
    karyawantetap.tampilTetap();


    System.out.println("\n=== KARYAWAN KONTRAK ===");
    
   
    KaryawanKontrak karyawankontrak = new KaryawanKontrak(2500000, "200", "Doni");
    karyawankontrak.tampilKontrak();
    
    }
}
