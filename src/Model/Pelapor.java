/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Ax39
 */
public class Pelapor extends Orang implements tampilkanData{
    public String Username,Password;

    public Pelapor() {         
    }
    
    public void register(Pelapor x,List l){
        Scanner n1 = new Scanner(System.in);
        System.out.println("====================================");
        System.out.print("Masukkan Username anda: ");
        x.Username = n1.next();
        System.out.print("Masukkan Password anda: ");
        x.Password = n1.next();
        System.out.print("Nama: ");
        x.Nama = n1.next();
        System.out.print("Nomor KTP: ");
        x.noKTP = n1.next();
        System.out.print("Alamat: ");
        x.Alamat = n1.next();
        System.out.print("Jenis Kelamin: ");
        x.jenisKelamin = n1.next();
        System.out.print("Tanggal Lahir: ");
        x.tanggalLahir = n1.next();
        System.out.print("Pekerjaan: ");
        x.Pekerjaan = n1.next();
        System.out.print("Kewarganegaraan: ");
        x.Kewarganegaraan = n1.next();
        x.Status = "Pelapor";
        System.out.println("====================================");
        
        l.add(x);
    }

    @Override
    public void showData() {
        System.out.println("Username: "+this.Username); 
        System.out.println("Password: "+this.Password);
        System.out.println("Nama: "+this.Nama);
        System.out.println("Nomor KTP: "+this.noKTP);
        System.out.println("Alamat: "+this.Alamat);
        System.out.println("Jenis Kelamin: "+this.jenisKelamin);
        System.out.println("Tanggal Lahir: "+this.tanggalLahir);
        System.out.println("Pekerjaan: "+this.Pekerjaan);
        System.out.println("Kewarganegaraan: "+this.Kewarganegaraan);
        System.out.println("Status: "+this.Status );
        
    }

    @Override
    public void showLaporan(List l) {
        //menampilkan seluruh data laporan yang bersangkutan dengan pelapor x    
    }
    

    

    

   

   
    
   
}
