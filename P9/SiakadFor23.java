package P9;

import java.util.Scanner;

public class SiakadFor23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);
        double nilai23, tertinggi23 = 0, terendah23 = 100; 
        int tidaLulus23 = 0, lulus23 = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + i + ":");
            nilai23 = latif23.nextDouble();
            if (nilai23 > tertinggi23) {
                tertinggi23 = nilai23;
            }
            if (nilai23 < terendah23) {
                terendah23 = nilai23;
            }
            if (nilai23 >= 60) {
                lulus23++;
            } else {
                tidaLulus23++;
            }
            
        }
            System.out.println("Nilai Tertinggi: "  + tertinggi23);
            System.out.println("NIlai Terendah: "   + terendah23 );
            System.out.println("Jumlah Mahasiswa Lulus Yaitu " + lulus23);
            System.out.println("Jumlah Mahasiswa Tidak Lulus Yaitu" + tidaLulus23);
    }
    
}
