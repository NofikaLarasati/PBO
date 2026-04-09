/*
 * Nama: Dafa Nofika Larasati
   Nim: 2501081014
   Deskripsi: menghitung deret bilangan kelipatan 11 dan rata-ratanya
 */
package PertemuanDaring;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class DeretKelipatan11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i,a,b,jumlah,total,rata_rata;
        System.out.print("Masukan Batas Awal = ");
        a = in.nextInt();
        System.out.print("Masukan Batas Akhir = ");
        b = in.nextInt();
        
        jumlah=0;
        total=0;
        if(a < b){
            for(i=a; i<=b; i++){
                if(i % 11 == 0 && i % 2 != 0){
                    System.out.print(i+" ");
                    jumlah++;
                    total = total + i;
                }
            }
        }
        else {
            for(i=a; i>=b; i--){
                if(i % 11 == 0 && i % 2 != 0){
                    System.out.print(i+" ");
                    jumlah++;
                    total = total + i;
                }
            }
        }
        rata_rata = total / jumlah;
        System.out.println("\nTotal :"+total);
        System.out.println("Rata-rata :"+rata_rata);
    }
}
    
