package Model;

public class Pelaku extends Orang{
    private Hakim hakim;
    private String putusanKeadilan;

    public Pelaku(Hakim hakim, String putusanKeadilan, String Nama, String noKTP, String Alamat, String jenisKelamin, String tanggalLahir, String Pekerjaan, String Kewarganegaraan, String Status) {
        super(Nama, noKTP, Alamat, jenisKelamin, tanggalLahir, Pekerjaan, Kewarganegaraan, Status);
        this.hakim = hakim;
        this.putusanKeadilan = putusanKeadilan;
    }
        
    
    public void Register(){
        
    }
    
}
