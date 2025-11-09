package P11;

import java.util.Scanner;

public class ArrayRataNilai23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);
        int [] nilaiMhs =  new int[10];
        int mhsLulus = 0;
        double total = 0;
        double rata2;
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke - " + (i+1) + " : ");
            nilaiMhs [i] = latif23.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs [i] > 70) {
                mhsLulus++;
                
            }
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata Rata Nilai " + rata2);
        System.out.println("Banyak Mahasiswa Lulus Yaitu : "+ mhsLulus + " Orang" );
    }
}
