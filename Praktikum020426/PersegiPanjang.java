/*
 * Nama: Dafa Nofika Larasati
   Nim: 2501081014
   Deskripsi: Menghitung Luas dan Keliling PersegiPanjang dengan 
 */
package Praktikum020426;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class PersegiPanjang { //public,acces,modifer ??
  
    ///atribut variabel
        int panjang;
        int lebar;
    
    ///contructor 
    PersegiPanjang(){
        
    }
    
    ///overloading
    PersegiPanjang(int p, int l){
    panjang = p;
    lebar = l;
    }
    
    ///method dengan nilai kembalian
    int Hitungluas(){
        return (panjang*lebar);
    }

    int HitungKel(){
        return(2*(panjang*lebar));
    }
           
               
    ///method tanpa nilai kembalian
    void TampilData(){
    System.out.println("Panjang persegi panjang =" +panjang);
    System.out.println("Lebar persegi panjang =" +lebar);
    System.out.println("luas persegi Panjang =" +Hitungluas());
    System.out.println("Keliling = " +HitungKel());    
    }
}
