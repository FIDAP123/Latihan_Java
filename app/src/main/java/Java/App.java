/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Java;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        String data_td = JOptionPane.showInputDialog("silahkan masukkan angka");
        int datadarah = Integer.parseInt(data_td);
        
        if (datadarah > 130)
        {
            System.out.println ("hipertensi");
        }
        else if (datadarah <90)
        {
            System.out.println ("hipotensi");
        }
        else
        {
            System.out.println ("sehat");
        }
    }
}
