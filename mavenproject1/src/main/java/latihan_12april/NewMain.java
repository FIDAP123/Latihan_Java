package latihan_12april;

public class NewMain {

    public static void main(String[] args) 
    {
        Karyawan Adi = new Karyawan();
        Karyawan Lani = new Karyawan();
        Adi.ID="A001";
        Adi.nama="Adi Pramono";
        Adi.divisi="Gudang";
        Adi.gaji=1800000;

        Lani.ID="A020";
        Lani.nama="Leni Dwi";
        Lani.divisi="administartor";
        Lani.gaji=2100000;
        
        System.out.println("Data Karyawan PT ABC:");
        System.out.println("ID    : "+Adi.ID);
        System.out.println("Nama  : "+Adi.nama);
        System.out.println("Divisi: "+Adi.divisi);
        System.out.println("Gaji  : "+Adi.gaji);
        System.out.println("--------------------------");
        System.out.println("ID    : "+Lani.ID);
        System.out.println("Nama  : "+Lani.nama);
        System.out.println("Divisi: "+Lani.divisi);
        System.out.println("Gaji  : "+Lani.gaji);

    }
    
}
