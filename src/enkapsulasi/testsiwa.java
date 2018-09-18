/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author acer
 */
public class testsiwa {
     public static void main(String args[]){
        Lat3 siswa = new Lat3 ();
        siswa.setnama("Natasya Putri Hardiyanti ");
        siswa.setabsen(30);
        siswa.setalamat("Malang");
        
         System.out.print("Nama : "+siswa.getnama()+"Absen : "+siswa.getabsen()+"Alamat : "+siswa.getalamat());
         
    }
            
}
