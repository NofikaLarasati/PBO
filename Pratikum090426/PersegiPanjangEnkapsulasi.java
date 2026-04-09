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
public class PersegiPanjangEnkapsulasi {

    ///atribut variabel
        private int panjang;
        private int lebar;
        private static int JumlahObjek = 0;
    
    ///contructor 
    PersegiPanjangEnkapsulasi(){
        JumlahObjek ++;
        
    }
    
    ///overloading
    PersegiPanjangEnkapsulasi (int panjangBaru, int lebarBaru){
    panjang = panjangBaru;
    lebar = lebarBaru;
    JumlahObjek++;
    }
    
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    
    public int getPanjang(){
        return panjang;
    }
    
    public void setLebar(int lebarBaru){
        lebar = lebarBaru;
    }
    
    public int getLebar(){
        return lebar;
    }
    
    public static int getJumlahObjek(){
        return JumlahObjek;
    }
    
    public int getLuas(){
        return (panjang*lebar);
    }
    
    public int getKeliling(){
         return(2*(panjang*lebar));
    }
    
    ///method dengan nilai kembalian
           
               
    ///method tanpa nilai kembalian
    void TampilData(){
    System.out.println("Panjang persegi panjang =" +panjang);
    System.out.println("Lebar persegi panjang =" +lebar);
    System.out.println("luas persegi Panjang =" +getLuas());
    System.out.println("Keliling = " +getKeliling());    
    }
    
    
}
