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
public class Laporan {
    private Pelapor pelapor;
    private Kasus cases;
    private Korban[] korban;
    private Pelaku pelaku;
    private Orang culprint,victim;
    private Hakim Judge;
    private String waktuKejadian;
    private String wakuDilaporkan;
    private String keputusanKasus;
    
    
    
    public Laporan(Korban k, Pelapor p, Kasus cases, Pelaku pelaku){
        this.korban = korban;
        this.pelapor = p ;
        this.cases = cases;
        this.pelaku = pelaku;
    }
    
    public void setReporter(Pelapor x){
        this.pelapor = x;
    }

    public Pelapor getPelapor() {
        return pelapor;
    }

    public Korban[] getKorban() {
        return korban;
    }

    public Pelaku getPelaku() {
        return pelaku;
    }
    
    public String getKeputusanKasus() {
        return keputusanKasus;
    }
    
    
    public void setKeputusan(String keputusan){
         this.keputusanKasus = this.getKeputusanKasus();
    }
    
    public void setJudge(){
    }

    public Kasus getCases(String kasus) {
        return cases;
    }
        
    public void setWaktuKejadian(){
        
    }
    
    public void setWaktuDilaporkan(){
        
    }
    
}
