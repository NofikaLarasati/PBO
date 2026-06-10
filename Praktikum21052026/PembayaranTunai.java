/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum21052026;

/**
 *
 * @author LENOVO
 */
public class PembayaranTunai extends Pembayaran{
    private double uang;

    public PembayaranTunai(double uang, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.uang = uang;
    }
    
    public double getUang() {
        return uang;
    }

    public void setUang(Double uang) {
        this.uang = uang;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Proses pembayaran secara tunai");
        System.out.println("Id Transaksi : "+idTransaksi);
        System.out.println("jumlah bayar : Rp. "+jumlahBayar);
        System.out.println("Uang yang diberikan : Rp. "+uang);
        if (uang>jumlahBayar){
            double kembalian = uang - jumlahBayar;
            System.out.println("Proses pembayaran berhasil ");
            System.out.println("Uang kembalian : Rp. "+kembalian);
        }else{
            double kekurangan = jumlahBayar - uang;
            System.out.println("Proses Pembayaran gagal");
            System.out.println("Uang anda kurang sebanyak : Rp. "+kekurangan);
        }
    }
}
