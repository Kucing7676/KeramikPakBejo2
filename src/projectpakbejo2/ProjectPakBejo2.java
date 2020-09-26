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
public class ProjectPakBejo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instansiasi
        //Keramik A
        HargaKeramik k1 = new HargaKeramik(30, 30, 10, 54000);
        System.out.println("Harga total keramik A: Rp." + k1.totalHarga());
        //Keramik B
        HargaKeramik k2 = new HargaKeramik(40, 40, 5, 65000);
        System.out.println("Harga total keramik B: Rp." + k2.totalHarga());
        //Keramik C
        HargaKeramik k3 = new HargaKeramik(30, 40, 8, 60000);
        System.out.println("Harga total keramik C: Rp." + k3.totalHarga());
    }
}
