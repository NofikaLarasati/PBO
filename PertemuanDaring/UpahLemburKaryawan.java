/*
 * Nama: Dafa Nofika Larasati
   Nim: 2501081014
   Deskripsi: program yang menghitung total upah lembur karyawan perusahaan
 */
package PertemuanDaring;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class UpahLemburKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jam,total, upah = 0;
        System.out.print("Masukan Jam Lembur Anda = ");
        jam = input.nextInt();
        if(jam <= 20){
            upah = 2000*jam;
        }
        if(jam > 20 && jam <=50){
            upah = 3000*jam;
        }
        if(jam > 50){
            System.out.println("Upah jam lembur hanya hingga 50 jam");
            upah = 3000*50;
        }
          total = jam * upah;
        System.out.println("total Upah Lembur =Rp."+upah);
    }
}
