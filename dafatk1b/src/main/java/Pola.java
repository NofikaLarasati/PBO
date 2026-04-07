/*
 * Nama / Nim : Dafa Nofika Larasati / 2501081014
   Deskripsi : Pola
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Pola {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i, j, d, k;
        System.out.print("Masukan Angka Pertama = ");
        d = input.nextInt();
        System.out.print("Masukan Angka Kedua = ");
        k = input.nextInt();
        for(i=1; i<=d; i++)
        {
            for(j=1; j<=k; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();           
        }
    }
    
}
