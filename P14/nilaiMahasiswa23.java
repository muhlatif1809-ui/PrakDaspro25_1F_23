package P14;

import java.util.Scanner;

public class nilaiMahasiswa23 {
    static Scanner latif23 = new Scanner(System.in);

    public static void main(String[] args) {
        
        int jmlMhs;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jmlMhs = latif23.nextInt();

        int nilaiMhs[] = new int[jmlMhs];

        isianArray(nilaiMhs);
        tampilArray(nilaiMhs);

        double totalNilai = hitTot(nilaiMhs);
        System.out.println("Total Nilai seluruh mahasiswa adalah " + totalNilai);
    }

    static void isianArray(int nilaiMhs[]) {
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa: ");
            nilaiMhs[i] = latif23.nextInt();
        }
    }

    static void tampilArray(int nilaiMhs[]) {
        System.out.println("Daftar nilai mahasiswa:");
        for (int nilai : nilaiMhs) {
            System.out.println(nilai);
        }
    }

    static double hitTot(int nilaiMhs[]) {
        double totalNilai = 0;
        for (int nilai : nilaiMhs) {
            totalNilai += nilai;
        }
        return totalNilai;
    }
}
