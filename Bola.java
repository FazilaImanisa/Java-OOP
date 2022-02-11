/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Bola{
    private double jarijari;
    public Bola(double jarijari){
        this.jarijari=jarijari;
    }
    
    public void setJarijari(double jarijari){
        this.jarijari=jarijari;
    }
    
    public void showDiameter(){
        System.out.println("Diameter : "+2*jarijari);
    }
    public void showKeliling(){
        System.out.println("Keliling Lingkaran : "+(2*Math.PI*Math.pow(jarijari,1)));
    }
    
    public void showLuas(){
        System.out.println("Luas Lingkara : "+(Math.PI*Math.pow(jarijari,2)));
    }
}
