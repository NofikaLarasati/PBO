/*
 * Nama: Dafa Nofika Larasati
   Nim: 2501081014
   Deskripsi: Buatlah program yang meminta input bilangan genap.
              jika bil genap maka akan ditambahkan 1,
              namun jika bil ganjil maka akan meminta ulang pada input
 */
package PertemuanDaring;

/**
 *
 * @author LENOVO
 */

import java.util.Scanner;
public class BilGenap {
    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka Genap = ");
        angka = input.nextInt();
        while(angka % 2 !=0){
            System.out.print("Masukan Angka Genap = ");
            angka = input.nextInt();
        }
        angka = angka + 1;
        System.out.println(angka);
    }
    
}
