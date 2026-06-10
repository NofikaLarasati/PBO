/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum04062026;

/**
 *
 * @author LENOVO
 */
public class PembayaranEwallet extends Pembayaran implements CetakStruk{
    private String namaEWallet;

    public PembayaranEwallet(String namaEWallet, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaEWallet = namaEWallet;
    }

    public String getNamaEWallet() {
        return namaEWallet;
    }

    public void setNamaEWallet(String namaEWallet) {
        this.namaEWallet = namaEWallet;
    }
    
    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran melalui E-Wallet");
        System.out.println("Nama E-Wallet : "+namaEWallet);
        System.out.println("Id Transaksi : "+idTransaksi);
        System.out.println("Jumlah Pembayaran : "+jumlahBayar);
    }
    
    @Override
    public void CetakStruk(){
        System.out.println("==== Struk E-Wallet ===");
        System.out.println("ID transaksi = "+idTransaksi);
        System.out.println("Jumlah Bayar = "+jumlahBayar);
        System.out.println("Nama pembayar = "+namaEWallet);
    }
}
