/*
 * Nama: Dafa Nofika Larasati
   Nim: 2501081014
   Deskripsi: Program Main Enkapsulasi 
 */
package Pratikum090426;

/**
 *
 */
import java.util.Scanner;
public class AkunBankEnkapsulasi {
    private String noRekening;
    private String namaNasabah;
    private double saldo = 1000000; // saldo awal

    public AkunBankEnkapsulasi(String noRekening, String namaNasabah) {
        this.noRekening = noRekening;
        this.namaNasabah = namaNasabah;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposit(double jumlah) {
        saldo += jumlah;
        System.out.println("Deposit berhasil!");
        System.out.println("Saldo sekarang: " + saldo);
    }

    public void withdraw(double jumlah) {
        if (jumlah > saldo) {
            System.out.println("Saldo Tidak Cukup");
        } else {
            saldo -= jumlah;
            System.out.println("Withdraw berhasil!");
            System.out.println("Saldo sekarang: " + saldo);
        }
    }
}
    
