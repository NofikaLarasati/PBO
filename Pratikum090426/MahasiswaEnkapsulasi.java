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
public class MahasiswaEnkapsulasi {
    
    ///atribut variabel
        private String nama, nim, jurusan;
        private Double ipk;
        private int umur;
    
    ///Method (public)
    MahasiswaEnkapsulasi(){
        
    }
    
    public MahasiswaEnkapsulasi(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }
    
    public MahasiswaEnkapsulasi(String nama, String nim, String jurusan, int umur, Double ipk){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.umur = umur;
        this.ipk = ipk;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNim(){
        return nim;
    }
    
    public String getJurusan(){
        return jurusan;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public Double getIpk(){
        return ipk;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    public void setIpk(Double ipk){
        this.ipk = ipk;
    }
    
    
    public void TampilInfo(){
        System.out.println("Nama    :" + nama);
        System.out.println("Nim     :" + nim);
        System.out.println("Jurusan :" + jurusan);
        System.out.println("Umur    :" + umur);
        System.out.println("Ipk     :" + ipk);
    }
    
    public String statusKelulusan(){
        if (ipk >= 2.75)
        {
            return "Lulus";
        }
        else
        {
            return "Tidak Lulus";
        }
    }
}
