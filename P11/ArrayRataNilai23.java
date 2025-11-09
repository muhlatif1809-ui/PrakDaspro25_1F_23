package P11;

import java.util.Scanner;

public class ArrayRataNilai23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jmlMhs = latif23.nextInt();
        int [] nilaiMhs =  new int[jmlMhs];
        int mhsLulus = 0, mhsTdkLulus = 0;
        double total = 0, totalLulus = 0, totalTdkLulus = 0;
        double rata2, rata2Lulus, rata2TdkLulus;
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke - " + (i+1) + " : ");
            nilaiMhs [i] = latif23.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];

            if (nilaiMhs [i] > 70) {
                totalLulus += nilaiMhs[i];
                mhsLulus++;   
            }
            if (nilaiMhs [i] <= 70) {
                totalTdkLulus += nilaiMhs[i];
                mhsTdkLulus++;
            }
        }
        rata2 = total/nilaiMhs.length;
        rata2Lulus = totalLulus / mhsLulus;
        rata2TdkLulus = totalTdkLulus / mhsTdkLulus;
        System.out.println("Rata - Rata Nilai Lulus : " + rata2Lulus);
        System.out.println("Rata - Rata Nilai Tidak Lulus : " + rata2TdkLulus);
        //System.out.println("Rata Rata Nilai " + rata2);
        //System.out.println("Banyak Mahasiswa Lulus Yaitu : "+ mhsLulus + " Orang" );
    }
}
