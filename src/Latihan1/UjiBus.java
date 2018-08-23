/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author USER
 */
public class UjiBus {
    public static void main(String[] args) {
        //(1)membuat objek busMini dari kelas Bus
        Bus busMini = new Bus();
        //memasukkan nilai jumlah penumpang dan penumpang maksimal ke
        //dalam objek busMini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        //memmanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //(2)menambahkan penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 5;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //(3)mengurangi jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();
        
        //(4)menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
        
    }

    private static class Bus {
        private int penumpang;
        private int maxPenumpang;

        public Bus() {
        }

        private void cetak() {
            System.out.println("Penumpang Bus sekarang adalah "+ penumpang);
            System.out.println("Penumpang maksimum seharusnya adalah "+ maxPenumpang);
        }
    }
}
