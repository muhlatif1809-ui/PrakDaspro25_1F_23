package P9;

import java.util.Scanner;

public class KafeDoWhile23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);
        int kopi, teh, roti, totalHarga;
        String namaPelanggan;
        int hargaKopi = 12000; 
        int hargaTeh = 7000;
        int hargaRoti = 20000;

    do {
        System.out.print("Masukkan Nama Pelanggan (Ketik 'Batal' Untuk Keluar): ");
        namaPelanggan = latif23.nextLine();
        if (namaPelanggan.equalsIgnoreCase("Batal")) {
            System.out.println("Transaksi Dibatalkan.");
            break;   
        }
        System.out.print("Jumlah Kopi: ");
        kopi = latif23.nextInt();
        System.out.print("Jumlah Teh: ");
        teh = latif23.nextInt();
        System.out.print("Jumlah Roti: ");
        roti = latif23.nextInt();

        totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
        System.out.println("Total Yang Harus Dibayar: Rp " + totalHarga);
        latif23.nextLine();
    } while (true);
        System.out.println("Semua Transaksi Selesai");
    }
     
}
