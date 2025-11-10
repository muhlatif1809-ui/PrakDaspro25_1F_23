package P11;

import java.util.Scanner;

public class Tugas3_23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner (System.in);

        String [] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino","Chocolate Ice" };
        String key;
        boolean ditemukan = false;

        System.out.print("Masukkan menu yang ingin dicari : ");
        key = latif23.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (menu [i].equalsIgnoreCase(key)) {
                System.out.println("Makanan "+key+" tersedia");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Makanan tidak tersedia di menu!");
        }
    }
    
}