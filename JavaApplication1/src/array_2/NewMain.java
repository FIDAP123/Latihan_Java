package array_2;

import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        int n;
        int sum=0;
        
        System.out.println("Silahkan masukan berapa elemen Array yang anda ingin: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        System.out.println(n);
        int a[] = new int [n];
        System.out.println("masukan nilai elemen di sini: ");
        for(int i=0;i<n;i++)
        {	
            a[i] = scan.nextInt();
            sum++;
        }
        System.out.println("Jumlah "+sum);
    }
}