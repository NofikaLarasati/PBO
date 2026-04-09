/*
 * Nama: Dafa Nofika Larasati
   Nim: 2501081014
   Deskripsi: Program menghitung harga tiket dan total harga tiket,
              diskon dan besar pembayaran.
 */
package PertemuanDaring;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class TiketBus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tujuan, kelas, jumlah, tiket, harga = 0;
        double total, diskon = 0, bayar;
        
        System.out.println("Tujuan: \n1.Jakarta  \n2.Yogya  \n3.Surabaya");
        System.out.print("Pilih tujuan: ");
        tujuan = input.nextInt();
        System.out.println("Kelas: \n1.Eksekutif  \n2.Bisnis  \n3.Ekonomi");
        System.out.print("Pilih kelas: ");
        kelas = input.nextInt();
        System.out.print("Jumlah tiket: ");
        tiket = input.nextInt();

         switch(tujuan)
        {
            case 1 :    
                        switch (kelas){
                            case 1 : harga = 70000;break;
                            case 2 : harga = 40000;break;
                            case 3 : harga = 10000;break;
                            default : System.out.println("masukkan kelas yang benar!!");
                        }break;
            case 2 :    switch (kelas){
                            case 1 : harga = 80000;break;
                            case 2 : harga = 50000;break;
                            case 3 : harga = 20000;break;
                            default : System.out.println("masukkan kelas yang benar!!");
                        }break;
            case 3 :    switch (kelas){
                            case 1 : harga = 90000;break;
                            case 2 : harga = 60000;break;
                            case 3 : harga = 30000;break;
                            default : System.out.println("masukkan kelas yang benar!!");
                        }break;
            default : System.out.println("Masukkan tujuan yang benar!!");
        }
        total = harga * tiket;
        if(tujuan == 3 && kelas == 1 && tiket >=4 || tujuan==2 && kelas==3 && tiket>=4)
        {
            diskon = total * 0.1;
        }
        bayar =total - diskon;
        System.out.println("Harga Tiket = "+harga);
        System.out.println("Total Harga = "+total);
        System.out.println("Diskon = "+diskon);
        System.out.println("Total yang harus dibayar = "+bayar);
    }
}
