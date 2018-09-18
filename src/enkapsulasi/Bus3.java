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
public class Bus3 {
    public int penumpang ;
    public int maxpenumpang ;
    public Bus3(int maxpenumpang){
        this.maxpenumpang = maxpenumpang ;
        penumpang = 0 ;
    }
    public void addpenumpang(int penumpang ) {
    
    int  temp ;
    temp = this.penumpang+penumpang ;
    if (temp>maxpenumpang)
    {
        System.out.println("penumpang melebihi kuota");
    }
    else{
        this.penumpang = temp ;
    }
    }
    public void getpenumpang (int password){
        if (password==24)
        {
            System.out.println("Pasword benar");
        }
        else{
            System.out.println("Pasword salah");
        }
    }
    public void cetakpenumpang(){
        System.out.println("penumpang bus sekarang = "+penumpang);
        System.out.println("Maksimum penumpang yg seharusnya adalah = "+maxpenumpang);
    }
}
