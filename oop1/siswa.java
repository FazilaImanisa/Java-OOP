/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;
public class siswa {
    String nama;
    int nilai;
    
    .cetaknilai(){
        System.out.println("Nilai Produktif" +nama+" adalah=" +nilai);
    }
    public boolean lulus(){
        return nilai>=75;
    }
    public boolean tidak lulus(){
        return nilai<74;
    }
}
