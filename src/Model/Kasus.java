/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author sifa user
 */
public class Kasus {
    private String jenisKasus;
    private String kodeKasus;
    private String spesifikasiKasus;
    private Laporan laporan;

    public Kasus(String jenisKasus, String kodeKasus, String spesifikasiKasus) {
        this.jenisKasus = jenisKasus;
        this.kodeKasus = kodeKasus;
        this.spesifikasiKasus = spesifikasiKasus;
    }

    public String getJenisKasus() {
        return jenisKasus;
    }

    public String getKodeKasus() {
        return kodeKasus;
    }

    public String getSpesifikasiKasus() {
        return spesifikasiKasus;
    }

    public void setJenisKasus(String jenisKasus) {
        this.jenisKasus = jenisKasus;
    }

    public void setKodeKasus(String kodeKasus) {
        this.kodeKasus = kodeKasus;
    }

    public void setSpesifikasiKasus(String spesifikasiKasus) {
        this.spesifikasiKasus = spesifikasiKasus;
    }
    
    
    
    
}
