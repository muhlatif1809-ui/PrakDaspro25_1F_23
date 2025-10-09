

import java.util.Scanner;

public class ifCetakKRS_23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sydah lunas? (true/false): ");
        boolean uktLunas = latif23.nextBoolean();

        String pesan = (uktLunas)
                ? "Pembayaran UKT terverefikisi. \nSilahkan cetak KRS dan minta tanda tangan DPA."
                : "Registrasi ditolak. Silakan lunasi UKZT terkebiih dahulu.";
                System.out.println(pesan);
        
           
            
       
        } 
    }

