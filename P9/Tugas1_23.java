package P9;

import java.util.Scanner;

public class Tugas1_23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);
        int hargaTiket = 50000, jumlahTiket = 0, totalPenjualan = 0, totalTiket = 0, sebelumDiskon = 0;
        double diskon = 0, totalHarga;

        
    do {
        System.out.print("Masukkan Jumlah Tiket Yang Dibeli (0 Untuk Batal): ");
        jumlahTiket = latif23.nextInt();
        if (jumlahTiket < 0) {
            System.out.println("Jumlah Tiket Tidak Valid!");
            continue;
        }
        if (jumlahTiket < 0) {
            break;
        }
        if (jumlahTiket >= 10) {
            diskon = 0.15;
        } else if (jumlahTiket >= 4) {
            diskon = 0.10;
        } else {
        diskon = 0.0;
        }
    sebelumDiskon = jumlahTiket * hargaTiket;
    totalHarga = jumlahTiket * hargaTiket * (1-diskon);
    totalTiket +=jumlahTiket;
    totalPenjualan += totalHarga;
    

    System.out.println("Total Harga Sebelum Di Diskon\t         " +sebelumDiskon);
    System.out.println("Total Harga Setelah  Diskon Yaitu \t Rp " +totalHarga);
    System.out.println("Total Tiket Terjual\t                 "+jumlahTiket);
    System.out.println("Total Penjualan Hari Ini\t         "+ totalPenjualan);        

    } while (true);
    } 
}
    

   