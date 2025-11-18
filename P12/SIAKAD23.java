package P12;

import java.util.Scanner;

public class SIAKAD23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);
        int jmlMahasiswa, jmlMatkul;
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        jmlMahasiswa = latif23.nextInt();
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        jmlMatkul = latif23.nextInt();
        int[][] nilai = new int[jmlMahasiswa][jmlMatkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input Nilai Mahasiswa Ke - " + (i+1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai Mata Kuliah " + (j+1) + " : ");
                nilai[i][j] = latif23.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai Rata - Rata : " + totalPerSiswa / jmlMatkul);
        } 
        System.out.println("\n==================================");
        System.out.println("Rata - Rata Nilai Setiap Mata Kuliah : ");

        for (int j = 0; j < jmlMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jmlMahasiswa; i++) {
                totalPerMatkul += nilai [i][j];       
            }
            System.out.println("Mata Kuliah " + (j+1) + ": " + totalPerMatkul / jmlMahasiswa);
        }
    }
}
