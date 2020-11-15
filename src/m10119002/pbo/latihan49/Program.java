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
 * Deskripsi Program : Program ini berisi program biaya emas kawin
 * (OBJECT ORIENTED)
 * 
 */
public class Program {
    public static void main(String[] args) {
        System.out.println("Hendi akan membeli emas kawin sebagai mahar nikah nya");
        System.out.println("dengan total seberat 15,7 gram. Jika harga 1 gram emas");
        System.out.println("per bulan oktober ini adalah Rp 570.000. Berapa total");
        System.out.println("bayar yangt harus dikeluarkan oleh hendi?");
        System.out.println("");
        
        EmasKawin eMas = new EmasKawin(570000);
        eMas.setBeratGram(15.7);
        System.out.println("Hendi harus membayar Rp ".
                concat(Double.toString(eMas.totalBayar())));
    }
}
