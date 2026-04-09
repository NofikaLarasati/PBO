/*
 * Nama: Dafa Nofika Larasati
   Nim: 2501081014
   Deskripsi: Program Main Enkapsulasi 
 */
package Pratikum090426;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class MainPersegiPanjangEnkapsulasi {
    public static void main(String[] args){
        //projek ppl menggunakan contruktor
        System.out.println("jumlah objek = "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        PersegiPanjangEnkapsulasi ppl = new PersegiPanjangEnkapsulasi();
        ppl.setPanjang(10);
        ppl.setLebar(7);
        
        System.out.println("objek 1 menggunakan kontruktor 1");
        System.out.println("akses method dalam main class");System.out.println("objek 1 menggunakan kontruktor 1");
        
        System.out.println("luas persegi panjang = "+ppl.getLuas());
        System.out.println("keliling = "+ppl.getKeliling());
        System.out.println();
        ppl.TampilData();
        
        //object pp2 menggunakan contructor 2
        System.out.println("Objek 2 menggunakan contructor 2");
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi(19,10);
        System.out.println("Akses method dalam main class");
        System.out.println();
        pp2.TampilData();
      
        //object pp3 menggunakan contructor 2 dengan input user 
        int panjang, lebar;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("masukan panjang = ");
        panjang = input.nextInt();
        System.out.print("Masukan lebar = ");
        lebar = input.nextInt();
        PersegiPanjangEnkapsulasi pp3 = new PersegiPanjangEnkapsulasi(panjang, lebar);
        
        pp3.TampilData();
        System.out.println("jumlah objek ="+PersegiPanjangEnkapsulasi.getJumlahObjek());
    }
    
}
