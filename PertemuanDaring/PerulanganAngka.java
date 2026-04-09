/*
 * Nama: Dafa Nofika Larasati
   Nim: 2501081014
   Deskripsi: Program Perulangan angka berbentuk segitiga siku-siku
 */
package PertemuanDaring;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class PerulanganAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, j, k;
        System.out.print("Masukan Angka = ");
        n = input.nextInt();
        for(i=n; i>=1; i--){
            for(j=1; j<i; j++){
                System.out.print(" ");
            }
            for(k=i;k<=n; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    } 
    
}
