/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestSiswa {
    public static void main(String[] args) {
       EnkapSiswa siswa = new EnkapSiswa();
       siswa.setName("Zila");
       siswa.setAge(18);
       siswa.getAddress("Malang");
       
       System.out.print("Name : "+siswa.getName()
       + " Absen : "+siswa.getAbsen()+
       " Address : "+siswa.getAddress());
    }    
}
