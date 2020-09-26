/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpakbejo2;

/**
 *
 * @author Lenovo
 */
public class HargaKeramik {
    //Atribut
    int sisiA, sisiB, isiBox, banyakBox, hargaPerBox;
    double luasArea = 1000000;
    //Constructor
    HargaKeramik(int a, int b, int isi, int harga){
        this.sisiA = a;
        this.sisiB = b;
        this.isiBox = isi;
        this.hargaPerBox = harga;
    }
    //methods
    double hitungLuasPerBox(){
        double luasBox = this.sisiA * this.sisiB * this.isiBox;
        return luasBox;
    }
    double hitungBox(){
        double jumlah = this.luasArea / hitungLuasPerBox();
        double jumlahBox = Math.ceil(jumlah);
        return jumlahBox;
    }
    double totalHarga(){
        double total = hitungBox() * this.hargaPerBox;
        return total;
    }
}
