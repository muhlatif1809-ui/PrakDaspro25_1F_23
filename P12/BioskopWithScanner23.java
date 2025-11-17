package P12;

import java.util.Scanner;

public class BioskopWithScanner23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom;
        
        
        while (true) {
            System.out.print("Masukkan Nama: ");
            nama = latif23.nextLine();
            System.out.print("Masukan Baris: ");
            baris = latif23.nextInt();
            System.out.print("Masukkan Kolom: ");
            kolom = latif23.nextInt();
            latif23.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input Penonton Lainnya? (y/n): ");
            next = latif23.nextLine();
            
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
