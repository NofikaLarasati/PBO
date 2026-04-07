/*
 * Nama: Dafa Nofika Larasati
   Nim: 2501081014
   Deskripsi: menginputkan penghasilan dina,berapa total uang dari halaman tersisa, 
              total uang yang didapat, dan sisa halaman
 */
package PertemuanDaring;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class InputPenghasilanDina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalHalaman = 50;
        int hargaPerHalaman = 15000;

        System.out.print("Masukkan jumlah halaman yang sudah dikerjakan : ");
        int X = input.nextInt();
        if (X >= 0 && X > 50) {
            System.out.println("Input tidak valid!");
        } else {
            int uangDiterima = X * 15000;
            int sisaHalaman = 50 - X;
            int uangSisa = sisaHalaman * 15000;

            System.out.println("total Uang yang sudah diterima: Rp " + uangDiterima);
            System.out.println("Sisa halaman: " + sisaHalaman);
            System.out.println("total Uang yang masih bisa didapat: Rp " + uangSisa);
        }
    }
}
