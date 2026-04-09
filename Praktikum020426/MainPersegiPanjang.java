/*
 * Nama: Dafa Nofika Larasati
   Nim: 2501081014
   Deskripsi: bagian MainMenghitung Luas dan Keliling PersegiPanjang
 */
package Praktikum020426;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class MainPersegiPanjang {
    /**
     * @paras args 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // object ppl menggunakan constructor 1
        PersegiPanjang ppl = new PersegiPanjang();
        ppl.panjang=10;
        ppl.lebar=7;
        System.out.println("Akses method dalam main class");
        System.out.println("Luas persegi panjang = "+ppl.Hitungluas() );
        System.out.println("Keliling = "+ppl.HitungKel());
        
        System.out.println();
        ppl.TampilData();
        
        //object pp2 menggunakan contructor 2
        System.out.println("Objek 2 menggunakan contructor 2");
        PersegiPanjang pp2 = new PersegiPanjang(19,10);
        System.out.println("Akses method dalam main class");
        System.out.println("Luas persegi panjang = "+pp2.HitungKel());
        System.out.println();
        pp2.TampilData();
      
        //object pp3 menggunakan contructor 2 dengan input user 
        System.out.println("\nObjek 3 memggunakan contructor 2");
        System.out.println("Panjang dan lebar input user");
        Scanner input = new Scanner(System.in);
        System.out.print("masukan panjang = ");
        int pjg = input.nextInt();
        System.out.print("Masukan lebar = ");
        int lbr = input.nextInt();
        PersegiPanjang pp3 = new PersegiPanjang(pjg,lbr);
        pp3.TampilData();
        
    }
    
}
