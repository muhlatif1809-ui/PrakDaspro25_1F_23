package P9;

import java.util.Scanner;

public class Tugas2_23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);{
        int jenis, durasi, totalharga = 0;

    do{
    System.out.println("Masukkan jenis kendaraan :");
    System.out.println("1. Mobil");
    System.out.println("2. Motor");
    System.out.println("0. Batal");
    System.out.print("Pilih Salah Satu: ");
    jenis = latif23.nextInt();

    if (jenis == 1 || jenis == 2) {
        System.out.print("Masukkan Durasi Anda Prkir (Jam): ");
        durasi = latif23.nextInt();
        if (durasi > 5) {
            totalharga = 12500;
        } else if (durasi == 1) {
            totalharga = durasi * 3000;
        } else if (durasi == 2) {
            totalharga = durasi * 2000;
        }
        System.out.println("Total Parkir Anda Adalah: " + totalharga);
    }else{
        System.out.println("Jenis Kendaraan Tidak Tersedi Silahkan Keluar!!");
    } 
    } while (jenis !=0);
    System.out.println("Transaksi selesai.");
        }
    }
}


        
    



    
       