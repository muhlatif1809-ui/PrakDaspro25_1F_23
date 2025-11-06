package P11;

import java.util.Scanner;

public class ArrayNilai23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);
        int [] nilaiAkhir = new int [10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkann Nilai Akhir Ke- "+i+" : ");
            nilaiAkhir [i] = latif23.nextInt();   
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai Akhir Ke- " + i + " Adalah " + nilaiAkhir[i]);
            
        }
    }
}
