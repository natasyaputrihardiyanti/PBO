/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek_Mak_nyus;

/**
 *
 * @author acer
 */
public class Ujibus {
    public static void main(String[]args){
         // membuat objek busBesar dari class Bus
   
        //  membuat objek busBesar dari class Bus
         
          Bus busBesar = new Bus(40);
         
          busBesar.getPenumpang(15);
          busBesar.getPenumpang(5);
          busBesar.getPenumpang(26);
          busBesar.getAverage();  
    }
}