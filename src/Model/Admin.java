/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author Ax39
 */
public class Admin extends Orang implements tampilkanData{
    public String Username,Password;
    
    public Admin(String Username, String Password,String Nama, String noKTP, String Alamat, String jenisKelamin, String tanggalLahir, String Pekerjaan, String Kewarganegaraan, String Status) {
        super(Nama, noKTP, Alamat, jenisKelamin, tanggalLahir, Pekerjaan, Kewarganegaraan, Status);
        this.Username = Username;
        this.Password = Password;
        this.Status = "Admin";
    }

    @Override
    public void showData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showLaporan(List l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
