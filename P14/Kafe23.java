package P14;

import java.util.Scanner;

public class Kafe23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);
        Menu("Andi", true);

        System.out.print("Berapa jenis menu yang ingin Anda pesan? ");
        int jumlahJenisMenu = latif23.nextInt();

        int[] daftarMenu = new int[jumlahJenisMenu];
        int[] daftarJumlah = new int[jumlahJenisMenu];

        for (int i = 0; i < jumlahJenisMenu; i++) {
            System.out.println("\n--- Pesanan ke-" + (i + 1) + " ---");

            System.out.print("Masukkan nomor menu (1–6): ");
            daftarMenu[i] = latif23.nextInt();

            while (daftarMenu[i] < 1 || daftarMenu[i] > 6) {
                System.out.print("Menu tidak valid! Masukkan ulang (1–6): ");
                daftarMenu[i] = latif23.nextInt();
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            daftarJumlah[i] = latif23.nextInt();
        }

        latif23.nextLine(); 

        System.out.print("\nMasukkan kode promo: ");
        String kodePromo = latif23.nextLine();

        int totalHarga = hitungTotalHargaMultiple(daftarMenu, daftarJumlah, kodePromo);
        System.out.println("\nTotal harga yang harus dibayar: Rp " + totalHarga);
    }

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon khusus untuk setiap pembelian!");
        }

        System.out.println("\n==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappucino  - Rp 20.000");
        System.out.println("3. Latte      - Rp 22.000");
        System.out.println("4. Teh Tarik  - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("=========================\n");
    }

    public static int hitungTotalHargaMultiple(int[] daftarMenu, int[] daftarJumlah, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        String[] namaMenu = {
            "Kopi Hitam", "Cappucino", "Latte",
            "Teh Tarik", "Roti Bakar", "Mie Goreng"
        };

        int hargaTotal = 0;

        System.out.println("\n============ Rincian Pesanan ============");

        for (int i = 0; i < daftarMenu.length; i++) {
            int index = daftarMenu[i] - 1;
            int subtotal = hargaItems[index] * daftarJumlah[i];
            hargaTotal += subtotal;

            System.out.println(namaMenu[index] + " x" + daftarJumlah[i] +
                               " = Rp " + subtotal);
        }

        System.out.println("Total sebelum diskon: Rp " + hargaTotal);

        if (kodePromo.equalsIgnoreCase("DISKON 50%")) {
            System.out.println("Diskon 50% diterapkan!");
            hargaTotal -= hargaTotal * 50 / 100;
        } else if (kodePromo.equalsIgnoreCase("DISKON 30%")) {
            System.out.println("Diskon 30% diterapkan!");
            hargaTotal -= hargaTotal * 30 / 100;
        } else {
            System.out.println("Kode promo tidak valid, tanpa diskon.");
        }

        System.out.println("=========================================");
        return hargaTotal;
    }
}
