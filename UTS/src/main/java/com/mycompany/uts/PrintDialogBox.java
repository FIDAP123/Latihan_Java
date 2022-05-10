package com.mycompany.uts;

import javax.swing.JOptionPane;

public class PrintDialogBox {
    String inputDialogBox;
    
    void printDialogBoxVoid(String printDialogBoxVoid)
    {
        JOptionPane.showMessageDialog(null,"Fungsi void Dialog Box = " + inputDialogBox,
                                          "Menampilkan Fungsi void", JOptionPane.INFORMATION_MESSAGE);
    }
    String printDialogBoxReturn(String printDialogBoxReturn)
    {
        return printDialogBoxReturn;
    }
}
