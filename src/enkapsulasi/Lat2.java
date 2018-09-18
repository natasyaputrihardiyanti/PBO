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
public class Lat2 {
    public static void main (String[]args){
        
    }
    private int penumpang ;
    private int maxpenumpang ;
    
    public Lat2 (int maxpenumpang){
        this.maxpenumpang = maxpenumpang ;
        penumpang = 0 ;
        
    }
    public void addpenumpang (int penumpang){
        int temp;
        temp = this.penumpang+penumpang ;
        if (temp >= maxpenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp ;
        }
    }
    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah "+penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah "+maxpenumpang);
        
        }
}





    
    

