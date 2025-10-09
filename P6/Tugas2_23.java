import java.util.Scanner;

public class Tugas2_23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = latif23.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
            
        }
    }
    
