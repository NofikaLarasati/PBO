/*
 * Nama: Dafa Nofika Larasati
   Nim: 2501081014
   Deskripsi: membuat program untuk membuka portal rahasia dengan
              menggunakan nomor misi kelipatan 3 dan 4
 */
package PertemuanDaring;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class PortanRahasiaKelipatan3dan4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i,awal,akhir;
         System.out.print("Masukkan nomor awal: ");
        awal = in.nextInt();
        System.out.print("Masukkan nomor akhir: ");
        akhir = in.nextInt();
        System.out.println("Nomor Misi Untuk Membuka Portal:");
        for(i=awal; i<=akhir; i++){
            if(i % 3 == 0 && i % 4 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
