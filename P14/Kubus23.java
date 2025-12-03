package P14;

import java.util.Scanner;

public class Kubus23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);
        int S, Sisi = 0;

        System.out.print("Masukkan Luas Sisi Kubus : ");
        S = latif23.nextInt();
        for (int i = 1; i < Sisi; i++) {
            System.out.print("Luas Sisi Kubus " + (i + 1) + " : ");
            S = latif23.nextInt();
        }
        System.out.println("Total Volume Kubus : " + S * S * S);
        System.out.println("Total Luas Permukaan Kubus : " + 6 * S * S);
    }
}