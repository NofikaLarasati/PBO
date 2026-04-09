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
public class MainMahasiswaEnkapsulasi {
        public static void main(String[] args) {

        // Membuat objek (pakai constructor kosong)
        MahasiswaEnkapsulasi mhs = new MahasiswaEnkapsulasi();

        // Mengisi data pakai setter
        mhs.setNama("Dafa Nofika Larasati");
        mhs.setNim("2501081014");
        mhs.setJurusan("Teknologi Informasi");
        mhs.setUmur(20);
        mhs.setIpk(3.2);

        // Menampilkan data
        System.out.println("=== DATA MAHASISWA ===");
        mhs.TampilInfo();

        // Menampilkan status kelulusan
        System.out.println("Status Kelulusan: " + mhs.statusKelulusan());
    }
}
