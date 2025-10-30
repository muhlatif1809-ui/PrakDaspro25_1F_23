package P10;

import java.util.Scanner;

public class NilaiKelompok23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);

        int i = 1, nilai, kelompokTertinggi = 0;
        double rataNIlai, rataTertinggi= 0;

        while (i <= 6) {
            System.out.println("Kelompok " + i);   
        
        int totalNilai = 0;
        for (int j = 1; j <= 5 ; j++) {
            System.out.print("  Nilai Dari Kelompok Penilai " + j + ":");
            nilai = latif23.nextInt();
            totalNilai += nilai;  
        }
            rataNIlai = totalNilai / 5.0;
            System.out.println("Kelompok : "    + i +   "Nilai Rata - Rata = " + rataNIlai );
            if (rataNIlai >= rataTertinggi ) {
                rataTertinggi = rataNIlai;
                kelompokTertinggi = 1;
                
                
            }
            i++;
    }
            System.out.println("Nilai Rata - Rata Tertinggi : " + rataTertinggi + "Kelompok" + kelompokTertinggi);

    }
    
}
