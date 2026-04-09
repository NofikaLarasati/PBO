/*
 * Nama: Dafa Nofika Larasati
   Nim: 2501081014
   Deskripsi: Program mencari nilaiAkhir dalam data Mahasiswa 
 */
package Praktikum020426;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Mahasiswa {
    String nama,nobp;
    Double tugas,UTS,UAS;
    
    Mahasiswa(){
        
    }
    
    Mahasiswa(Double Tugas, Double Uas, Double Uts){
        tugas= Tugas;
        UAS= Uas;
        UTS= Uts; 
    }
    
    double nilaiAkhir(){
        return ((0.25*tugas)+(0.35*UTS)+(0.4*UAS));
    }
    
    void TampilData(){
        System.out.println("nilai tugas = "+tugas);
        System.out.println("nilai UAS = "+UAS);
        System.out.println("nilai UTS = "+UTS);
        System.out.println("nilai rata-rata = "+nilaiAkhir());
    }
    
}
