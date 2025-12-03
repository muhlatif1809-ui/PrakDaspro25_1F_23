package P14;

import java.util.Scanner;

public class HitungBalok23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);
        int p, I, t, L, vol;

        System.out.println("Masukkan Panjang");
        p = latif23.nextInt();

        System.out.println("Masukkan Lebar");
        I = latif23.nextInt();

        System.out.println("Masukkan Tinggi");
        t = latif23.nextInt();

        L = p * I;
        System.out.println("Luas Persegi Panjang Adalah " + L);
        vol = p * I * t;
        System.out.println("Volume Balok Adalah " + vol);
        latif23.close();

    }
        static int hitungLuas(int pjg, int lb) {
            int Luas = pjg * lb;
            return Luas;
        }
        static int hitungVolume(int tinggi, int a, int b){
            int volume = hitungLuas(a, b) * tinggi;
            return volume;
        }
}
