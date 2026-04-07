/*
 * Nama / Nim : Dafa Nofika Larasati / 2501081014
   Deskripsi : Program Permutasi
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Permutasi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n, r, i, permutasi, faktorial, faktorial2;
        System.out.print("Masukan Angka Pertama = ");
        n = input.nextInt();
        System.out.print("\nMasukan Angka Kedua = ");
        r = input.nextInt();
        faktorial = 1;
        faktorial2 = 1;
        
        for(i=1; i<=n; i++)
        {
            faktorial = faktorial * i;
        }
        for(i=1; i<=n-r; i++)
        {
            faktorial2 = faktorial2 * i;
        }
        permutasi = faktorial / faktorial2;
        System.out.println("Permutasi ("+n+", "+r+") = " +permutasi);
    }
    
}
