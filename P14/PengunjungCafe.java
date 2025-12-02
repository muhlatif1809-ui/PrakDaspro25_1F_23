package P14;

public class PengunjungCafe {
    public static void main(String[] args) {
        daftarpengunjung("ALi","Budi", "Citra");
    }
    static void daftarpengunjung(String...namaPengunjung){
        System.out.println("Daftar Nama Pengunjung: ");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }
    }
}

