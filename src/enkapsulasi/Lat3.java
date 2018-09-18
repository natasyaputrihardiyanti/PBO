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
public class Lat3 {
    private String nama ;
    private String alamat ;
    private int absen ;
    
   public int getabsen(){
       return absen ;
   }
      
        public String getnama(){
       return nama ;
        }
         public String getalamat(){
       return alamat ;
         }
         public void setabsen(int newabsen){
             absen = newabsen ;
         }
         public void setnama (String newnama){
             nama = newnama ;
         }
         public void setalamat (String newalamat){
             alamat = newalamat;
         }

   
    
   
}