package P9;

import java.util.Scanner;

public class SiakadFor23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        for (int i = 1; i <= 10; i++) {
            System.out.print("MAsukkan nilai Mahasiswa ke-" + i + ":");
            nilai = latif23.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
                
            }
            
        }
            System.out.println("Nilai Tertinggi: "  + tertinggi);
            System.out.println("NIlai Terendah: "   + terendah );
    }
    
}
