import java.util.Scanner;

public class Tugas3_23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);

        System.out.print("Masukkann jenis user (dosen/mahasiswa)");
        String user = latif23.nextLine();

        if (user.equals("dosen")) {

                System.out.println("Akses wifi diberikan (dosen)");
        } else if (user.equals("mahasiswa")) {

            System.out.print("Masukkan jumlah SKS yang diambil: ");
            int sks = latif23.nextInt();

            if (sks >= 12) {
                System.out.println("Akses wifi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");

            }
        } else {
            System.out.println("Akses diitolak");

        }
                
            }
            
        }
