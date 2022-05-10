package gradleproject1;
public class App 
{
    public static void main(String[] args) 
    {
        int a,b;
        float hasil;
        boolean hasil_1;
        a= 3;
        b= 4;
        hasil = a+b;
        System.out.println ("    a+b   = " + hasil);
        hasil = a-b;
        System.out.println ("    a-b   = " + hasil);
        hasil = (float)a/b;
        System.out.println ("    a/b   = " + hasil);
        hasil = a*b;
        System.out.println ("    a*b   = " + hasil);
        hasil = a+b-a*b/6;
        System.out.println ("a+b-a*b/6 = " + hasil);
        hasil_1 = a > b;
        System.out.println ("    a>b  = " + hasil_1);
    }
}
