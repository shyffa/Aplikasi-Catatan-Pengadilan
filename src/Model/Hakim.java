/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author sifa user
 */
public class Hakim extends Orang implements tampilkanData {

    private String Username;
    private String Password;
    private Pelaku p;
    private Laporan laporan;

    public Hakim(String Username, String Password, String Nama, String noKTP, String Alamat, String jenisKelamin, String tanggalLahir, String Pekerjaan, String Kewarganegaraan, String Status) {
        super(Nama, noKTP, Alamat, jenisKelamin, tanggalLahir, Pekerjaan, Kewarganegaraan, Status);
        this.Username = Username;
        this.Password = Password;
    }
    
    @Override
    public void showData() {
        
    }

    @Override
    public void showLaporan(List l) {
        System.out.println("Nama Pelapor: "+laporan.getPelapor());
        System.out.println("Nama Korban : "+laporan.getKorban());
        System.out.println("Nama Pelaku : "+laporan.getPelaku());
        System.out.println("Keputusan Kasus : "+laporan.getKeputusanKasus());
    }
    
    public void beriPutusan(Pelaku p){
        this.laporan.getCases("Pembunuhan");
        this.laporan.setKeputusan("Hukuman Penjara seumur hidup");
        
        this.laporan.getCases("Penculikan");
        this.laporan.setKeputusan("Hukuman Penjara 15 tahun");    
        
        this.laporan.getCases("Pencurian");
        this.laporan.setKeputusan("Hukuman Penjara");    
        
        /*if (this.laporan.getCases("Pencurian")) {
        System.out.println("Hukuman penjara 10 tahun dan ganti rugi");
        }*/
    }
}
