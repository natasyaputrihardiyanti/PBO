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
public class Lat1 {
    public int penumpang ;
    public int maxpenumpang ;
    
    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah : "+penumpang);
        System.out.println("Penumpang maxium seharusnya adalah : "+maxpenumpang);
    }
    
    public class ujibus{
    }
        public static void main(String[]args){
            //membuat objek busmini kelas bus
            Lat1 busMini = new Lat1();
            busMini.penumpang = 5 ;
            busMini.maxpenumpang=15 ;
            //memanggil method cetas pada kelas bus
            busMini.cetak();
            //enambahkan penumpang padabusMini
            busMini.penumpang = busMini.penumpang + 5 ;
            busMini.cetak();
            
            //mengurangi jumlah penumpang 
            busMini.penumpang = busMini.penumpang - 2 ;
            busMini.cetak();
            //menambah
             busMini.penumpang = busMini.penumpang +8 ;
             busMini.cetak();
             
        }  
    }
