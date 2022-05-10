package com.mycompany.mavenproject1;

import javax.swing.*;


public class NewClass {
    
    public static void main(String[] args) {
        System.out.println (" 1. Darah kamu > 120 ");
        System.out.println (" 2. Tekanan darah kamu <90 ");
        System.out.println (" 3. Tekanan darah kamu diantara 120-90 ");
       
        String data_darah = JOptionPane.showInputDialog(" Masukkan pilihanmu :  ");
        int darah= Integer.parseInt(data_darah);
        switch(darah)
        {
            case 1: 
              System.out.println (" Kamu Hipertensi ");
              break;
            case 2: 
              System.out.println (" Kamu Hipotensi ");
              break;
            case 3: 
              System.out.println (" Kamu Normal ");
              break;
            default:
              System.out.println (" Data yg kamu masukkan tidak benar ");
              break;
    }   }
}
