/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class UjiBus3 {
public static void main(String[] args){
    int password;

//membuat objek busBesar dari class Bus3
    Bus3 busBesar = new Bus3(40);
    busBesar.cetak();
    
//penambahan penumpang
    busBesar.getPenumpang(123);
    busBesar.cetak();
    
//penambahan penumpang
    busBesar.getPenumpang(121);
    busBesar.cetak();

//penambahan penumpang
    busBesar.getPenumpang(123);
    busBesar.cetak();
    
    System.out.println("Rata-rata Penumpang : "+busBesar.getAverage());
}
}
