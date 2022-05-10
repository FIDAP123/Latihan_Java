package com.mycompany.mavenproject2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tugas_Array {
    public static void main(String[] args) {
//        boolean program;
        int pilih_menu;
 //       int pilih_bil,pilih_arr;
        int baris,kolom;
//        String Sbaris,Skolom,Sarray;
        Object[] pilih_program = {"Console Output(Scanner)"};
//        Object[] pilih_bilangan = {"Bulat", "Desimal"};
//        Object[] pilih_array = {"Single Dimensi","Multi Dimensi"};
        String input_bilangan;
        String bulat = "bulat";
        String tidak = "tidak";
        String ya = "ya";
        String single_dimensi = "single dimensi";
        String multi_dimensi = "multi dimensi";
        String desimal = "desimal";
        String input_dimensi;
        String input_lanjut;
                
        while(true)
        {
            System.out.println("Program dibuat oleh :\nFitradana Putra Irwantriyana(21670019)\n\n\n"+
                               "Program Pembuat Array Single Dimensi dan Multi Dimensi\n");
            JOptionPane.showMessageDialog(null,"Program Pembuat Array Single Dimensi dan Multi Dimensi\nProgram dibuat oleh :\nFitradana Putra Irwantriyana (21670019)",
                                          "Program Pembuat Array", JOptionPane.INFORMATION_MESSAGE);
            pilih_menu = JOptionPane.showOptionDialog(null,
                                                      "Silahkan memilih program yang ingin anda jalankan :",
                                                      "Menu",JOptionPane.YES_NO_OPTION,
                                                      JOptionPane.QUESTION_MESSAGE,null,
                                                      pilih_program,pilih_program[0]);
            if(pilih_menu == JOptionPane.YES_OPTION)
            {
                while(true)
                {
                    System.out.println("Silahkan pilih array dalam bentuk bilangan bulat atau desimal");
                    System.out.print("(Ketik dengan format \"bulat\" atau \"desimal\")= ");
                    Scanner scan = new Scanner(System.in);
                    input_bilangan = scan.nextLine();
                    if(input_bilangan.equals(bulat))
                    {
                        while(true)
                        {
                            System.out.println("Silahkan pilih array dalam bentuk single dimensi atau multi dimensi");
                            System.out.print("(Ketik dengan format \"single dimensi\" atau \"multi dimensi\")= ");
                            Scanner dimensi_scan = new Scanner(System.in);
                            input_dimensi = dimensi_scan.nextLine();
                            if(input_dimensi.equals(single_dimensi))
                            {
                                while(true)
                                {
                                    System.out.println("Silahkan masukkan jumlah array");
                                    System.out.print("(Ketik dengan format angka)= ");
                                    Scanner onedb = new Scanner(System.in);
                                    baris = onedb.nextInt();
                                    int array_int_1D [] = new int [baris];
                                    for(int i=0;i<baris;i++)
                                    {	
                                        System.out.print("masukan nilai array " + "[" + i + "]" + " = ");
                                        Scanner arodb = new Scanner(System.in);
                                        array_int_1D[i] = arodb.nextInt();
                                    }
                                    System.out.print("Array = ");
                                    System.out.print("[");
                                    for (int hasil = 0; hasil < baris; hasil++)
                                    {
                                        System.out.print(array_int_1D[hasil] + ",");
                                    }
                                    System.out.println("\b]");
                                    System.out.println("Apakah anda ingin lanjut membuat array singgle dimensi ?");
                                    System.out.print("(Ketik dengan format \"ya\" atau \"tidak\")= ");
                                    Scanner lan = new Scanner(System.in);
                                    input_lanjut = lan.next();
                                    if(input_lanjut.equals(tidak))
                                    {
                                        break;
                                    }
                                }
                            }
                            else if(input_dimensi.equals(multi_dimensi))
                            {
                                while(true)
                                {
                                    System.out.println("Silahkan masukkan jumlah baris");
                                    System.out.print("(Ketik dengan format angka)= ");
                                    Scanner scan_bar = new Scanner(System.in);
                                    baris = scan_bar.nextInt();
                                    
                                    System.out.println("Silahkan masukkan jumlah kolom");
                                    System.out.print("(Ketik dengan format angka)= ");
                                    Scanner scan_kol = new Scanner(System.in);
                                    kolom = scan_kol.nextInt();
                                    
                                    int [][] array_int_2D = new int [baris][kolom];
                                    for(int jumlah_baris = 0; jumlah_baris < baris; jumlah_baris++)
                                    {
                                        for(int jumlah_kolom = 0; jumlah_kolom < kolom; jumlah_kolom++)
                                        {
                                            System.out.print("masukan nilai array " + "[" + jumlah_baris + "]" + "[" + (jumlah_kolom) +
                                                             "]" + " = ");
                                            array_int_2D[jumlah_baris][jumlah_kolom] = scan.nextInt();
                                        }
                                    }
                                    System.out.println("Array = ");
                                    for(int hasil_baris = 0; hasil_baris < baris ; hasil_baris++)
                                    {
                                        System.out.print("\t\t[");
                                        for(int hasil_kolom = 0; hasil_kolom < kolom ; hasil_kolom++)
                                        {
                                            System.out.print(array_int_2D[hasil_baris][hasil_kolom] + ",");
                                        }  
                                        System.out.println("\b]");
                                    }
                                    
                                    System.out.println("Apakah anda ingin lanjut membuat array multi dimensi ?");
                                    System.out.print("(Ketik dengan format \"ya\" atau \"tidak\")= ");
                                    input_lanjut = scan.next();
                                    if(input_lanjut.equals(tidak))
                                    {
                                        break;
                                    }
                                }
                                
                            }
                            else
                            {
                                System.out.println("Error");
                                System.out.println("Jawaban yang anda masukkan tidak sesuai format, silahkan masukkan format lagi");
                            }
                            
                            System.out.println("Apakah anda ingin pergi ke pilih array bulat atau desimal ?");
                            System.out.print("(Ketik dengan format \"ya\" atau \"tidak\")= ");
                            input_dimensi = scan.next();
                            if(input_dimensi.equals(ya))
                            {
                                break;
                            }
                        }
                    }
                    else if(input_bilangan.equals(desimal))
                    {
                        while(true)
                        {
                            System.out.println("Silahkan pilih array dalam bentuk single dimensi atau multi dimensi");
                            System.out.print("(Ketik dengan format \"single dimensi\" atau \"multi dimensi\")= ");
                            Scanner dimensi_scan = new Scanner(System.in);
                            input_dimensi = dimensi_scan.nextLine();
                            if(input_dimensi.equals(single_dimensi))
                            {
                                while(true)
                                {
                                    System.out.println("Silahkan masukkan jumlah array");
                                    System.out.print("(Ketik dengan format angka)= ");
                                    Scanner onedbf = new Scanner(System.in);
                                    int barisi= onedbf.nextInt();
                                    float [] array_float_1D = new float [barisi];
                                    for(int i=0;i<barisi;i++)
                                    {	
                                        System.out.print("masukan nilai array " + "[" + i + "]" + " = ");
                                        Scanner arodb = new Scanner(System.in);
                                        array_float_1D[i] = arodb.nextFloat();
                                    }
                                    System.out.print("Array = ");
                                    System.out.print("[");
                                    for (int hasil = 0; hasil < barisi; hasil++)
                                    {
                                        System.out.print(array_float_1D[hasil] + ",");
                                    }
                                    System.out.println("\b]");
                                    System.out.println("Apakah anda ingin lanjut membuat array singgle dimensi ?");
                                    System.out.print("(Ketik dengan format \"ya\" atau \"tidak\")= ");
                                    Scanner lan = new Scanner(System.in);
                                    input_lanjut = lan.next();
                                    if(input_lanjut.equals(tidak))
                                    {
                                        break;
                                    }
                                }
                            }
                            else if(input_dimensi.equals(multi_dimensi))
                            {
                                while(true)
                                {
                                    System.out.println("Silahkan masukkan jumlah baris");
                                    System.out.print("(Ketik dengan format angka)= ");
                                    Scanner scan_bar = new Scanner(System.in);
                                    int barisi_m = scan_bar.nextInt();
                                    
                                    System.out.println("Silahkan masukkan jumlah kolom");
                                    System.out.print("(Ketik dengan format angka)= ");
                                    Scanner scan_kol = new Scanner(System.in);
                                    int kolomi_m = scan_kol.nextInt();
                                    
                                    float [][] array_float_2D = new float [barisi_m][kolomi_m];
                                    for(int jumlah_baris = 0; jumlah_baris < barisi_m; jumlah_baris++)
                                    {
                                        
                                        for(int jumlah_kolom = 0; jumlah_kolom < kolomi_m; jumlah_kolom++)
                                        {
                                            System.out.print("masukan nilai array " + "[" + jumlah_baris + "]" + "[" + (jumlah_kolom) +
                                                             "]" + " = ");
                                            array_float_2D[jumlah_baris][jumlah_kolom] = scan.nextFloat();
                                        }
                                    }
                                        System.out.println("Array = ");
                                        for(int hasil_baris = 0; hasil_baris < barisi_m ; hasil_baris++)
                                        {
                                            System.out.print("\t\t[");
                                            for(int hasil_kolom = 0; hasil_kolom < kolomi_m ; hasil_kolom++)
                                            {
                                                System.out.print(array_float_2D[hasil_baris][hasil_kolom] + ",");
                                            }  
                                            System.out.println("\b]");
                                        }
                                    System.out.println("Apakah anda ingin lanjut membuat array multi dimensi ?");
                                    System.out.print("(Ketik dengan format \"ya\" atau \"tidak\")= ");
                                    Scanner multi_scan = new Scanner(System.in);
                                    input_lanjut = multi_scan.next();
                                    if(input_lanjut.equals(tidak))
                                    {
                                        break;
                                    }
                                }
                                
                            }
                            else
                            {
                                System.out.println("Error");
                                System.out.println("Jawaban yang anda masukkan tidak sesuai format, silahkan masukkan format lagi");
                            }
                            System.out.println("Apakah anda ingin pergi ke pilih array bulat atau desimal ?");
                            System.out.print("(Ketik dengan format \"ya\" atau \"tidak\")= ");
                            Scanner jika = new Scanner(System.in);
                            input_dimensi =  jika.nextLine();
                            if(input_dimensi.equals(ya))
                            {
                                break;
                            }
                        }
                    }
                    else
                    {
                        System.out.println("Error");
                        System.out.println("Jawaban yang anda masukkan tidak sesuai format, silahkan masukkan format lagi");
                    }
                    System.out.println("Apakah anda ingin pergi ke menu ?");
                    System.out.print("(Ketik dengan format \"ya\" atau \"tidak\")= ");
                    Scanner jut = new Scanner(System.in);
                    input_lanjut = jut.nextLine();
                    if(input_lanjut.equals(ya))
                    {
                        break;
                    }
                }
            }
//            else if (pilih_menu == JOptionPane.NO_OPTION)
//            {
//                while(joptionpane = true)
//                {
//                    pilih_bil = JOptionPane.showOptionDialog(null,
//                                                "Silahkan pilih array dalam bentuk bilangan bulat atau desimal ?",
//                                                "Pilih Bilangan",JOptionPane.YES_NO_OPTION,
//                                                JOptionPane.QUESTION_MESSAGE,null,pilih_bilangan,
//                                                pilih_bilangan[1]);
//                    if(pilih_bil == JOptionPane.YES_OPTION)
//                    {
//                        pilih_arr = JOptionPane.showOptionDialog(null,
//                                                "Silahkan pilih array single dimensi atau multi dimensi ?",
//                                                "Pilih Array",JOptionPane.YES_NO_OPTION,
//                                                JOptionPane.QUESTION_MESSAGE,null,pilih_array,
//                                                pilih_array[1]);
//                        if(pilih_arr == JOptionPane.YES_OPTION)
//                        {
//                            Sarray = JOptionPane.showInputDialog(null, "Masukkan Array jumlah array",
//                                                                "input data jumlah array", 
//                                                                JOptionPane.QUESTION_MESSAGE);
//                            int Iarray = Integer.parseInt(Sarray);
//                        }
//                        else if(pilih_arr == JOptionPane.NO_OPTION)
//                        {
//                            Sbaris = JOptionPane.showInputDialog(null, "Masukkan Array jumlah Baris",
//                                                                "input data array", 
//                                                                JOptionPane.QUESTION_MESSAGE);
//                            int Ibaris = Integer.parseInt(Sbaris);
//                            Skolom = JOptionPane.showInputDialog(null, "Masukkan Array jumlah Kolom",
//                                                                "input data array", 
//                                                                JOptionPane.QUESTION_MESSAGE);
//                            int Ikolom = Integer.parseInt(Skolom);
//                        }
//                    }
//                    else if (pilih_bil == JOptionPane.NO_OPTION)
//                    {
//                        pilih_arr = JOptionPane.showOptionDialog(null,
//                                                "Silahkan pilih array single dimensi atau multi dimensi ?",
//                                                "Pilih Array",JOptionPane.YES_NO_OPTION,
//                                                JOptionPane.QUESTION_MESSAGE,null,pilih_array,
//                                                pilih_array[1]);
//                        if(pilih_arr == JOptionPane.YES_OPTION)
//                        {
//                            Sarray = JOptionPane.showInputDialog(null, "Masukkan Array jumlah array",
//                                                                "input data jumlah array", 
//                                                                JOptionPane.QUESTION_MESSAGE);
//                            int Iarrayd = Integer.parseInt(Sarray);
//                        }
//                        else if(pilih_arr == JOptionPane.NO_OPTION)
//                        {
//                            Sbaris = JOptionPane.showInputDialog(null, "Masukkan Array jumlah Baris",
//                                                                "input data array", 
//                                                                JOptionPane.QUESTION_MESSAGE);
//                            int Fbaris = Integer.parseInt(Sbaris);
//                            Skolom = JOptionPane.showInputDialog(null, "Masukkan Array jumlah Kolom",
//                                                                "input data array", 
//                                                                JOptionPane.QUESTION_MESSAGE);
//                            int Fkolom = Integer.parseInt(Skolom);
//                        }
//                    }
//                }
//            }
            else
            {
                System.out.println("Error");
                System.out.println("Jawaban yang anda masukkan tidak sesuai format, silahkan masukkan format lagi");    
            }
            System.out.println("Apakah anda ingin keluar ?");
                System.out.print("(Ketik dengan format \"ya\" atau \"tidak\")= ");
                Scanner scan = new Scanner(System.in);
                String input = scan.next();
                if(input.equals(ya))
                {
                    break;
                }
        }
    }
    
}