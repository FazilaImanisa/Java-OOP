/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Bus {
    private int Penumpang;
    private int maxPenumpang;
    
    //konstruktor kelas Bus
    public Bus(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        Penumpang = 0;
    }
    
    //method mutator untuk menambahkan penumpang
    public void addPenumpang(int Penumpang){
        int temp;
        temp = this.Penumpang+Penumpang;
        if (temp >= maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        }else {
               this.Penumpang = temp;
        }
    }
public void cetak(){
System.out.println("Penumpang Bus sekarang adalah " + Penumpang);
System.out.println("Penumpang maksimum seharusnya adalah " + maxPenumpang);
}
    
}
