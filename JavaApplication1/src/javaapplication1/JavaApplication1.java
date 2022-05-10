package javaapplication1;

import javax.swing.*;

public class JavaApplication1
{
    public static void main(String[] args) 
    {
        String data_pilih , data_panjang, data_lebar, data_d1, data_d2, data_sisi, data_alas, data_tinggi, data_r, data_sisi_a, data_sisi_b;
        double luas, alas, panjang, lebar, d1, d2, sisi, tinggi, r, sisi_a, sisi_b;
        int tanya, pilih;
        boolean sistem = true;
        
        System.out.println("Program dibuat oleh :\nFitradana Putra Irwantriyana(21670019)\n\n\n"+"Program Penghitung Luas Bangun Datar\n");
        JOptionPane.showMessageDialog(null,"Program dibuat oleh :\nFitradana Putra Irwantriyana (21670019)","Program Penghitung Luas Bangun Datar", JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println("Pilih Luas Bangun Datar : \n" + "1. Segitiga\n" + "2. Lingkaran\n"+"3. Persegi\n"+"4. Persegi Panjang\n"+"5. Layang - Layang / Belah Ketupat\n"+"6. Jajar Genjang\n"+"7. Trapesium\n");
        while(sistem)
        {
            data_pilih = JOptionPane.showInputDialog(null, "1. Segitiga\n" + "2. Lingkaran\n"+"3. Persegi\n"+"4. Persegi Panjang\n"+"5. Layang - Layang / Belah Ketupat\n"+"6. Jajar Genjang\n"+"7. Trapesium\n\n"+"Silahkan ketik sesuai pilihan di atas (ketik dalam bentuk angka) : ","Pilih Luas Bangun Datar", JOptionPane.QUESTION_MESSAGE);
            pilih = Integer.parseInt(data_pilih);
            
            switch(pilih)
            {
                case 1://segitiga
                    System.out.println("1. Luas Segitiga");
                    data_alas = JOptionPane.showInputDialog(null, "Silahkan masukkan nilai alasnya","Menghitung Luas Segitiga", JOptionPane.QUESTION_MESSAGE);
                    alas = Double.parseDouble(data_alas);
                    System.out.println("alas = " + data_alas);
                    data_tinggi = JOptionPane.showInputDialog(null, "Silahkan masukkan nilai tingginya","Menghitung Luas Segitiga", JOptionPane.QUESTION_MESSAGE);
                    tinggi = Double.parseDouble(data_tinggi);
                    System.out.println("tinggi = " + data_tinggi);
                    
                    luas = 0.5 * alas * tinggi;
                    System.out.println("Luas Segitiga = 0.5 x alas x tinggi\n" + "Luas Segitiga = " + luas + "\n");
                    JOptionPane.showMessageDialog(null, "Luas Segitiga = "+luas, "Menghitung Luas Segitiga", JOptionPane.INFORMATION_MESSAGE);
                    
                    tanya = JOptionPane.showConfirmDialog(null,"Apakah anda ingin menghitung luas bangun datar lagi?","Selesai",JOptionPane.YES_NO_OPTION);
                    if(tanya == JOptionPane.NO_OPTION)
                    {
                        sistem = false;
                    }
                    break;
                case 2:
                    System.out.println("2. Luas Lingkaran");
                    data_r = JOptionPane.showInputDialog(null, "Silahkan masukkan nilai jari-jarinya","Menghitung Luas Lingkaran", JOptionPane.QUESTION_MESSAGE);
                    r = Double.parseDouble(data_r);
                    System.out.println("r = " + data_r);
                    
                    luas = 3.14 * r * r;
                    System.out.println("Luas Lingkaran = 3.14 x r x r\n" + "Luas Lingkaran = " + luas + "\n");
                    JOptionPane.showMessageDialog(null, "Luas Lingkaran = "+luas, "Menghitung Luas Lingkaran", JOptionPane.INFORMATION_MESSAGE);
                    
                    tanya = JOptionPane.showConfirmDialog(null,"Apakah anda ingin menghitung luas bangun datar lagi?","Selesai",JOptionPane.YES_NO_OPTION);
                    if(tanya == JOptionPane.NO_OPTION)
                    {
                        sistem = false;
                    }
                    break;
                case 3:
                    System.out.println("3. Luas Persegi");
                    data_sisi = JOptionPane.showInputDialog(null, "Silahkan masukkan nilai panjang sisinya","Menghitung Luas Persegi", JOptionPane.QUESTION_MESSAGE);
                    sisi = Double.parseDouble(data_sisi);
                    System.out.println("sisi = " + data_sisi);
                    
                    luas = sisi*sisi;
                    System.out.println("Luas Persegi = sisi x sisi\n" + "Luas Persegi = " + luas + "\n");
                    JOptionPane.showMessageDialog(null, "Luas Peregi = "+luas, "Menghitung Luas Persegi", JOptionPane.INFORMATION_MESSAGE);
                    
                    tanya = JOptionPane.showConfirmDialog(null,"Apakah anda ingin menghitung luas bangun datar lagi?","Selesai",JOptionPane.YES_NO_OPTION);
                    if(tanya == JOptionPane.NO_OPTION)
                    {
                        sistem = false;
                    }
                    break;
                case 4:
                    System.out.println("4. Luas Persegi Panjang");
                    data_panjang = JOptionPane.showInputDialog(null, "Silahkan masukkan nilai panjangnya","Menghitung Luas Persegi Panjang", JOptionPane.QUESTION_MESSAGE);
                    panjang = Double.parseDouble(data_panjang);
                    System.out.println("panjang = " + data_panjang);
                    data_lebar = JOptionPane.showInputDialog(null, "Silahkan masukkan nilai lebarnya","Menghitung Luas Persegi Panjang", JOptionPane.QUESTION_MESSAGE);
                    lebar = Double.parseDouble(data_lebar);
                    System.out.println("lebar = " + data_lebar);
                    
                    luas = panjang * lebar;
                    System.out.println("Luas Persegi Panjang = panjang x lebar\n" + "Luas Persegi Panjang = " + luas + "\n");
                    JOptionPane.showMessageDialog(null, "Luas Persegi Panjang = "+luas, "Menghitung Luas Persegi Panjang", JOptionPane.INFORMATION_MESSAGE);
                    
                    tanya = JOptionPane.showConfirmDialog(null,"Apakah anda ingin menghitung luas bangun datar lagi?","Selesai",JOptionPane.YES_NO_OPTION);
                    if(tanya == JOptionPane.NO_OPTION)
                    {
                        sistem = false;
                    }
                    break;
                case 5:
                    System.out.println("5. Luas Layang - Layang / Belah Ketupat");
                    data_d1 = JOptionPane.showInputDialog(null, "Silahkan masukkan nilai panjang diagonal pertamanya","Menghitung Luas Layang - Layang / Belah Ketupat", JOptionPane.QUESTION_MESSAGE);
                    d1 = Double.parseDouble(data_d1);
                    System.out.println("d1 = " + data_d1);
                    data_d2 = JOptionPane.showInputDialog(null, "Silahkan masukkan nilai panjang diagonal keduanya","Menghitung Luas Layang - Layang / Belah Ketupat", JOptionPane.QUESTION_MESSAGE);
                    d2 = Double.parseDouble(data_d2);
                    System.out.println("d2 = " + data_d2);
                    
                    luas = 0.5 * d1 * d2;
                    System.out.println("Luas Layang - Layang / Belah Ketupat = 0.5 x d1 x d2\n" + "Luas Layang - Layang / Belah Ketupat = " + luas + "\n");
                    JOptionPane.showMessageDialog(null, "Luas Layang - Layang / Belah Ketupat = "+luas, "Menghitung Luas Layang - Layang / Belah Ketupat", JOptionPane.INFORMATION_MESSAGE);
                    
                    tanya = JOptionPane.showConfirmDialog(null,"Apakah anda ingin menghitung luas bangun datar lagi?","Selesai",JOptionPane.YES_NO_OPTION);
                    if(tanya == JOptionPane.NO_OPTION)
                    {
                        sistem = false;
                    }
                    break;
                case 6:
                    System.out.println("6. Luas Jajar Genjang");
                    data_alas = JOptionPane.showInputDialog(null, "Silahkan masukkan nilai alasnya","Menghitung Luas Jajar Genjang", JOptionPane.QUESTION_MESSAGE);
                    alas = Double.parseDouble(data_alas);
                    System.out.println("alas = " + data_alas);
                    data_tinggi = JOptionPane.showInputDialog(null, "Silahkan masukkan nilai tingginya","Menghitung Jajar Genjang", JOptionPane.QUESTION_MESSAGE);
                    tinggi = Double.parseDouble(data_tinggi);
                    System.out.println("tinggi = " + data_tinggi);
                    
                    luas = alas * tinggi;
                    System.out.println("Luas Jajar Genjang = alas x tinggi\n" + "Luas Jajar Genjang = " + luas + "\n");
                    JOptionPane.showMessageDialog(null, "Luas Jajar Genjang = "+luas, "Menghitung Luas Jajar Genjang", JOptionPane.INFORMATION_MESSAGE);
                    
                    tanya = JOptionPane.showConfirmDialog(null,"Apakah anda ingin menghitung luas bangun datar lagi?","Selesai",JOptionPane.YES_NO_OPTION);
                    if(tanya == JOptionPane.NO_OPTION)
                    {
                        sistem = false;
                    }
                    break;
                case 7:
                    System.out.println("7. Luas Trapesium");
                    data_sisi_a = JOptionPane.showInputDialog(null, "Silahkan masukkan nilai panjang sisi sejajar a-nya","Menghitung Luas Trapesium", JOptionPane.QUESTION_MESSAGE);
                    sisi_a = Double.parseDouble(data_sisi_a);
                    System.out.println("a = " + data_sisi_a);
                    data_sisi_b = JOptionPane.showInputDialog(null, "Silahkan masukkan nilai panjang sisi sejajar b-nya","Menghitung Luas Trapesium", JOptionPane.QUESTION_MESSAGE);
                    sisi_b = Double.parseDouble(data_sisi_b);
                    System.out.println("b = " + data_sisi_b);
                    data_tinggi = JOptionPane.showInputDialog(null, "Silahkan masukkan nilai tingginya","Menghitung Luas Trapesium", JOptionPane.QUESTION_MESSAGE);
                    tinggi = Double.parseDouble(data_tinggi);
                    System.out.println("tinggi = " + data_tinggi);
                    
                    luas = 0.5 * (sisi_a + sisi_b) * tinggi;
                    System.out.println("Luas Trapesium = 0.5 x (a+b) x tinggi\n" + "Luas Trapesium = " + luas + "\n");
                    JOptionPane.showMessageDialog(null, "Luas Trapesium = "+luas, "Menghitung Luas Trapesium", JOptionPane.INFORMATION_MESSAGE);
                    
                    tanya = JOptionPane.showConfirmDialog(null,"Apakah anda ingin menghitung luas bangun datar lagi?","Selesai",JOptionPane.YES_NO_OPTION);
                    if(tanya == JOptionPane.NO_OPTION)
                    {
                        sistem = false;
                    }
                    break;
                default :
                    JOptionPane.showMessageDialog(null,"Perintah Tidak Sesuai","ERROR",JOptionPane.ERROR_MESSAGE);
            }   
    }   }
}