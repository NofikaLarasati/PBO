/*
 * Nama: Dafa Nofika Larasati
   Nim: 2501081014
   Deskripsi: program menentukan ulang tahun pnp yang 
              ke- apakah dies natalis atau dekade
 */
package PertemuanDaring;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class UlangTahunPNP {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n, dekade;
        System.out.print("Masukan Umur PNP = ");
        n = in.nextInt();
        if(n % 10 == 0){
            dekade = n / 10;
            System.out.println("Dekade PNP Ke-"+dekade);
        }
        else {
            System.out.println("Dies Natalis PNP Ke-"+n);
        }
    }
}
