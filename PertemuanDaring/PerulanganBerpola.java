/*
 * Nama: Dafa Nofika Larasati
   Nim: 2501081014
   Deskripsi: Program perulangan menggunakan pola matriks
 */
package PertemuanDaring;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class PerulanganBerpola {
    public static void main(String[] args) {
        int i, j, n = 5;
        for(i = 1; i<=n; i++){
            for(j=1; j<=n; j++)
                {
                    if(i == 1 || i == n)
                    {
                        System.out.print(" 0 ");
                    }
                    else if(i == j ){
                        System.out.print(" 0 ");
                    }
                    else
                    {
                        System.out.print(" x ");
                    }
                }
            System.out.println();
        }
    }
}
