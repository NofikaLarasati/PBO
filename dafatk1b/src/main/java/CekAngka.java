/*
 * Nama / Nim : Dafa Nofika Larasati / 2501081014
   Deskripsi : Class Cek Angka
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class CekAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,banyak;
        System.out.print("Masukkan angka: ");
        n = input.nextInt();
        banyak = 1;

        while (n > 9)
        {
            System.out.print("Masukkan angka: ");
            n = input.nextInt();
            banyak = banyak + 1;
        }
        System.out.println("Jumlah angka yang diinputkan = " + banyak);
    }
}

   
    
