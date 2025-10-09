import java.util.Scanner;

public class nestedUjianSkrips_23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);
        String pesan;
        System.out.println("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak)");
        String bebasKompen = latif23.nextLine().trim();

        System.out.println("Masukkan jumlah log bimbingan 1: ");
        int bimbinganP1 = latif23.nextInt();
        System.out.println("Masukkan jumlah log bimbingan 2: ");
        int bimbinganP2 = latif23.nextInt();

        
        if (bebasKompen.equalsIgnoreCase("YA")) {
                if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                    pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
                } else if (bimbinganP1 < 8 && bimbinganP2 < 4 ) {
                    pesan = "Gagal Log bimbingan P1 kurang dari 8 kali dan bimbingan P2 kurang dari 4 kali";
                } else if (bimbinganP1 < 8) {
                    pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
                } else { 
                    pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
                }
            } else {
                pesan = "Gagal mahasiswa masih memiliki tanggungan kompen";
            }
            System.out.println(pesan);
                
        }
    }
    

