package P14;

public class PengunjungCafe23 {
    public static void main(String[] args) {
        daftarpengunjung("ALi","Budi", "Citra");
        daftarpengunjung("Andi");
        daftarpengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
    static void daftarpengunjung(String...namaPengunjung){
        System.out.println("Daftar Nama Pengunjung: ");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }
}

