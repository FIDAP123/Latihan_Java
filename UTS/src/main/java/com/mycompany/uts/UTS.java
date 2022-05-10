package com.mycompany.uts;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class UTS 
{
 
    public static void main(String[] args) 
    {
        boolean ulangMenu, ulangPilihKeluar,ulangPilihConsole, ulangPilihDialogBox ,ulangInputDialogBox , ulangConsole, ulangDialogBox;
        String y,n,pilihKeluarConsole, pilihConsole;
        int pilihKeluarDialogBox, pilihDialogBox,pilih;
        
        Object[] pilihMenu = {"Console", "Dialog Box"};
        Object[] pilihYaTidak = {"Ya", "Tidak"};
        ulangConsole = false;
        ulangInputDialogBox = false;
        ulangDialogBox = false;
        ulangPilihConsole = false;
        ulangPilihDialogBox = false;
        ulangMenu = false;
        ulangPilihKeluar = false;
        y ="y";
        n = "n";
        do{
            pilih = JOptionPane.showOptionDialog(null,
                                                      "Silahkan Pilih Tampilan",
                                                      "Menu",JOptionPane.YES_NO_OPTION,
                                                      JOptionPane.QUESTION_MESSAGE,null,
                                                      pilihMenu,pilihMenu[1]);
            if(pilih==0)
            {
                System.out.println("\nProgram dibuat Oleh :\nFitradana Putra Irwantriyana(21670019)\n\n"+
                               "Program Penampil Input dengan Menggunakan Konsep PBO\n");
                while(!ulangConsole)
                {
                    
                    PrintConsole console1 = new PrintConsole();

                    System.out.print("Silahkan Masukkan Input : ");
                    Scanner scanConsole = new Scanner(System.in);

                    console1.inputConsole = scanConsole.nextLine();
                    console1.printConsoleVoid(console1.inputConsole);
                    System.out.println("Fungsi non void Console = " + console1.printConsoleReturn(console1.inputConsole));

                    while(!ulangPilihConsole)
                    {
                        System.out.print("Apakah Anda Ingin Mengulang Menampilkan Input di Console ?\n(ketik \"y\" untuk mengulang, ketik \"n\" untuk kembali ke menu) : ");
                        Scanner scanPilihKeluarConsole = new Scanner(System.in);
                        pilihKeluarConsole = scanPilihKeluarConsole.nextLine();
                        if(pilihKeluarConsole.equals(y))
                        {
                            ulangPilihConsole = true;
                        }else if(pilihKeluarConsole.equals(n))
                        {
                            ulangPilihConsole = true;
                            ulangConsole = true;
                        }else
                        {
                            System.out.println("Pilihan Anda Salah");
                        }

                    }
                    ulangPilihConsole = false;
                }
                ulangConsole = false;
                do{
                    System.out.print("Apakah Anda Ingin Keluar ? \n(ketik \"y\" jika ingin keluar dan ketik \"n\" jika ingin kembali ke-menu) : ");
                    Scanner scanPilihConsole = new Scanner(System.in);
                    pilihConsole = scanPilihConsole.nextLine();
                    if(pilihConsole.equals(y))
                    {
                       ulangMenu = true; 
                       ulangPilihKeluar = true;
                    }else if(pilihConsole.equals(n))
                    {
                       ulangPilihKeluar = true;
                    }else
                    {
                        System.out.println("Pilihan Anda Salah");
                    }
                }while(!ulangPilihKeluar);
                ulangPilihKeluar = false;
            }else if(pilih==1)
            {
                JOptionPane.showMessageDialog(null,"Program Penampil Input dengan Menggunakan Konsep PBO\nProgram dibuat oleh :\nFitradana Putra Irwantriyana (21670019)",
                                          "Program Penampil Input", JOptionPane.INFORMATION_MESSAGE);
                while(!ulangDialogBox)
                {
                    PrintDialogBox dialogBox1 = new PrintDialogBox();


                    dialogBox1.inputDialogBox = JOptionPane.showInputDialog(null,"Silahkan Masukkan Input : ", "Masukkan Input", JOptionPane.QUESTION_MESSAGE);
                    
                    if(dialogBox1.inputDialogBox == null)
                    {
                        while(!ulangInputDialogBox)
                        {
                            pilihKeluarDialogBox = JOptionPane.showOptionDialog(null,
                                                          "Apakah Anda Ingin Kembali Ke-Menu ?",
                                                          "Menu Ulang",JOptionPane.YES_NO_OPTION,
                                                          JOptionPane.QUESTION_MESSAGE,null,
                                                          pilihYaTidak,pilihYaTidak[1]);
                            if(pilihKeluarDialogBox == 0)
                            {
                                ulangInputDialogBox = true;
                                ulangDialogBox = true;
                            }else if(pilihKeluarDialogBox == 1)
                            {
                                ulangInputDialogBox = true;
                            }else
                            {
                                ulangInputDialogBox = true;
                            }
                        }
                        ulangInputDialogBox = false;
                    }else
                    {
                        dialogBox1.printDialogBoxVoid(dialogBox1.inputDialogBox);
                        JOptionPane.showMessageDialog(null,"Fungsi non void Dialog Box = " + dialogBox1.printDialogBoxReturn("" + dialogBox1.inputDialogBox),
                                                  "Menampilkan Fungsi non void", JOptionPane.INFORMATION_MESSAGE);
                    }   
                    while(!ulangPilihDialogBox)
                    {
                        pilihKeluarDialogBox = JOptionPane.showOptionDialog(null,
                                                      "Apakah Anda Ingin Mengulang Menampilkan Input di Dialog Box ?",
                                                      "Menu Ulang",JOptionPane.YES_NO_OPTION,
                                                      JOptionPane.QUESTION_MESSAGE,null,
                                                      pilihYaTidak,pilihYaTidak[1]);
                        if(pilihKeluarDialogBox == 0)
                        {
                            ulangPilihDialogBox = true;
                        }else if(pilihKeluarDialogBox == 1)
                        {
                            ulangPilihDialogBox = true;
                            ulangDialogBox = true;
                        }else
                        {
                            ulangPilihDialogBox = true;
                            ulangDialogBox = true;
                        }
                        
                    } 
                    ulangPilihDialogBox = false;
                }
                ulangDialogBox = false;
                do{
                     pilihDialogBox = JOptionPane.showOptionDialog(null,
                                                      "Apakah Anda Ingin Keluar ?",
                                                      "Menu Keluar",JOptionPane.YES_NO_OPTION,
                                                      JOptionPane.QUESTION_MESSAGE,null,
                                                      pilihYaTidak,pilihYaTidak[1]);
                    if(pilihDialogBox==0)
                    {
                       ulangMenu = true; 
                       ulangPilihKeluar = true;
                    }else if(pilihDialogBox==1)
                    {
                       ulangPilihKeluar = true;
                    }else
                    {
                       ulangMenu = true; 
                       ulangPilihKeluar = true;
                    }
                }while(!ulangPilihKeluar);
                ulangPilihKeluar = false;
            }else
            {
                ulangMenu = true;
            }
        }while(!ulangMenu);
        System.out.println("selesai");
    }
}