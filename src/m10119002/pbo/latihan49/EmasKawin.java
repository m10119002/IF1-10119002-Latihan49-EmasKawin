/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan49;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Class untuk objek Emas Kawin
 * 
 * 
 */
public class EmasKawin {
    private int hargaPerGram;
    private double beratGram;
    
    public EmasKawin(int hargaPerGram) {this.hargaPerGram = hargaPerGram;}
    public void setBeratGram(double beratGram) {this.beratGram = beratGram;}
    public double getBeratGram() {return this.beratGram;}
    public double totalBayar() {return this.beratGram * (double)this.hargaPerGram;}
}
