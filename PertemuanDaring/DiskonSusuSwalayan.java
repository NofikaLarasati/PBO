/*
 * Nama: Dafa Nofika Larasati
   Nim: 2501081014
   Deskripsi: membuat program total pembayaran setelah diskon,
              total pembayaran sebelum , dan diskon
 */
package PertemuanDaring;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class DiskonSusuSwalayan {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int merk,banyak;
        long total_bayar, diskon, total_akhir, harga;
        
        System.out.println("\n=== list susu swalayan ===");
        System.out.println("\n merk x : Rp 40.000, diskon 10% (min 3 kotak susu)");
        System.out.println("\n merk y : Rp 50.000, diskon 12% (min lebih 3 kotak susu)");
        System.out.println("\n merk z : Rp 60.000, diskon 15% (u/ pembeli urutan 2,3 dan seterusnya)");
        System.out.print("masukan merk susu (x,y,z) : ");
         merk = in.nextInt();
        
        switch(merk)
        {
            case 1 : harga = 40000;
                System.out.print("Masukkan jumlah pembelian : ");
                banyak = in.nextInt();
                if (banyak < 3)
                {
                    diskon = 0;
                    total_bayar = banyak * harga;
                    total_akhir = total_bayar - diskon;
                    System.out.println("Total pembelian : Rp. " +total_bayar+ "dan mendapat diskon sebesar : Rp" +diskon);
                    System.out.println("Total pembayaran : Rp. " +total_akhir);
                }
                else
                {
                    total_bayar = banyak * harga;
                    diskon = (long) (0.1 * total_bayar);
                    total_akhir = total_bayar - diskon;
                    System.out.println("Total pembelian : Rp. " +total_bayar+ " dan mendapat diskon sebesar : Rp " +diskon);
                    System.out.println("Total pembayaran : Rp. " +total_akhir);
                }break;
                
            case 2 : harga = 50000;
                System.out.print("Masukkan jumlah pembelian : ");
                banyak = in.nextInt();
                if (banyak <= 3)
                {
                    diskon = 0;
                    total_bayar = banyak * harga;
                    total_akhir = total_bayar - diskon;
                    System.out.println("Total pembelian : Rp. " +total_bayar+ " dan mendapat diskon sebesar : Rp " +diskon);
                    System.out.println("Total pembayaran : Rp. " +total_akhir);
                }
                else
                {
                    total_bayar = banyak * harga;
                    diskon = (long) (0.12 * total_bayar);
                    total_akhir = total_bayar - diskon;
                    System.out.println("Total pembelian : Rp. " +total_bayar+ " dan mendapat diskon sebesar : Rp " +diskon);
                    System.out.println("Total pembayaran : Rp. " +total_akhir);
                }break;
                
            case 3 : harga = 60000;
                System.out.print("Masukkan jumlah pembelian : ");
                banyak = in.nextInt();
                diskon = (banyak - 1)*(harga - (long)(harga*0.15));
                total_bayar = 60000 + diskon;
                System.out.println("Total pembayaran : Rp " +total_bayar);
                break;
        }
        }
}
