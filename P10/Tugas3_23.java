package P10;

import java.util.Scanner;

public class Tugas3_23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);
        
        System.out.print("Jumlah Cabang Cafe : ");
        int cabang = latif23.nextInt();
        System.out.println("=== Input Penjualan Per Cabang ===");

        int totalCabang = 0, totalPelanggan =0;
        for (int i = 1; i <= cabang; i++) {
            System.out.println("--- Cabang " + i + " --- " );
            System.out.print("Jumlah Pelanggan : ");
            int pelanggan = latif23.nextInt();
            int totalItem = 0;
            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("- Pelanggan " + j + " Memesan Berapa Item : ");
                int item = latif23.nextInt();
                totalItem += item;
            }
            System.out.println("Total Pelanggan: " + pelanggan);
            System.out.println("Item Terjual: " + totalItem);
            totalPelanggan += pelanggan;
            totalCabang += totalItem;   
        } 
        System.out.println("Total Seluruh Cabang: ");
        System.out.println("Pelanggan: " + totalPelanggan + " Orang ");
        System.out.println("Item Terjual: " + totalCabang + " Item ");        
    }
}
    

