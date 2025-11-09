package P11;

import java.util.Scanner;

public class Tugas2_23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner (System.in);

        System.out.print("Jumlah pesanan pelanggan: ");
        int jmlPesanan = latif23.nextInt();
        latif23.nextLine();

        String [] Pesanan = new String[jmlPesanan];
        double [] harga = new double[jmlPesanan];
        double total03 = 0;

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println();
            System.out.print("Pesanan ke- "+(i+1)+", Nama makanan/minuman : ");
            Pesanan [i] = latif23.nextLine();
            //alya.nextLine();
            System.out.print("Harga menu "+ Pesanan[i] +" adalah Rp. ");
            harga [i] = latif23.nextDouble();
            latif23.nextLine();
        }
        for (int i = 0; i < jmlPesanan; i++) {
            total03 += harga[i];
        }
        System.out.println();
        System.out.println("===Daftar Pesanan===");
        for (int i = 0; i < harga.length; i++) {
            System.out.println((i+1)+". "+ Pesanan[i]+" \t"+harga[i]);
        }
        System.out.println();
        System.out.println("Total pesanan yaitu Rp. "+total03);
        System.out.println();
    }
    
}