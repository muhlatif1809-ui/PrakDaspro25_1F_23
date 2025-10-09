

import java.util.Scanner;

public class ifCetakKRS_23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sydah lunas? (true/false): ");
        boolean uktLunas = latif23.nextBoolean();

        if (uktLunas) {
            System.out.println("pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tyangan DPA");
            
        }
    }
}
