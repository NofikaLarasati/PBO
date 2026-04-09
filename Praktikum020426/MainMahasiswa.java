/*
 * Nama: Dafa Nofika Larasati
   Nim: 2501081014
   Deskripsi: bagian main dari Program mencari nilaiAkhir dalam data Mahasiswa 
 */
package Praktikum020426;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class MainMahasiswa {
    /**
     * 
     */
    public static void main(String[] args) {
        Mahasiswa ppl = new Mahasiswa();
        ppl.nama = "Dafa Nofika Larasati";
        ppl.nobp = "2501081014";
        ppl.tugas = 80.5;
        ppl.UAS = 75.5;
        ppl.UTS = 80.0;
       
        ppl.TampilData();
        System.out.println();
        
        Scanner input = new Scanner (System.in);
        System.out.println("objek 2 menggunakan contructor 2");
        System.out.println("nama = ");
        String nama = input.nextLine();
        System.out.println(" nobp = ");
        String nobp = input.nextLine();
        System.out.println("nilai tugas = ");
        Double Tugas = input.nextDouble();
        System.out.println("nilai uas = ");
        Double Uas = input.nextDouble();
        System.out.println("nilai Uts = ");
        Double Uts = input.nextDouble();
        Mahasiswa pp2 = new Mahasiswa ( Tugas, Uas, Uts );
        pp2.TampilData(); 
    }
    
}



