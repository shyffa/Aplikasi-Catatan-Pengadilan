/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ax39
 */
public class Orang {
      
    
    public String Nama,noKTP,Alamat,jenisKelamin,
            tanggalLahir,Pekerjaan,Kewarganegaraan,
            Status;

    public Orang() {
    }

    
    public Orang(String Nama, String noKTP, String Alamat, String jenisKelamin, String tanggalLahir, String Pekerjaan, String Kewarganegaraan, String Status) {
        this.Nama = Nama;
        this.noKTP = noKTP;
        this.Alamat = Alamat;
        this.jenisKelamin = jenisKelamin;
        this.tanggalLahir = tanggalLahir;
        this.Pekerjaan = Pekerjaan;
        this.Kewarganegaraan = Kewarganegaraan;
        this.Status = Status;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public String getPekerjaan() {
        return Pekerjaan;
    }

    public String getKewarganegaraan() {
        return Kewarganegaraan;
    }

    public String getStatus() {
        return Status;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setPekerjaan(String Pekerjaan) {
        this.Pekerjaan = Pekerjaan;
    }

    public void setKewarganegaraan(String Kewarganegaraan) {
        this.Kewarganegaraan = Kewarganegaraan;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
}
