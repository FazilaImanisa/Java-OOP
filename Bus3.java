/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Bus3 {
   private double penumpang;
   private double maxPenumpang;
   private double PenumpangBaru;
   private double counter;
   
   //konstruksi kelas Bus
   public Bus3(double maxPenumpang){
       this.maxPenumpang = maxPenumpang;
       penumpang =0;
   }
   //method mutator untuk menambahkan penumpang
   public void addPenumpang(double penumpang){
       double temp;
       temp =this.penumpang+penumpang;
       if(temp >= maxPenumpang){
           System.out.println("penumpang Melebihi Kuota");
       }else {
           this.penumpang = temp;
           counter++;
       }
   }
   //double password
   public void getPenumpang(double password){
       if (password==123){
           System.out.println("\nPassword Benar");
           addPenumpang(15);
       }
       else{
           System.out.println("\nPassword Salah!!!");
       }
   }
   
   public double getAverage(){
       return penumpang/counter;
   }
   
   public void cetak(){
       System.out.println("Penumpang Bus sekarang adalah : "+penumpang);
       System.out.println("Penumpang maksimum seharusnya adalah : "+maxPenumpang);
   }
}
  
