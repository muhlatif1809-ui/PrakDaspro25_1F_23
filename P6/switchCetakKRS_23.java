

import java.util.Scanner;

public class switchCetakKRS_23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);
        System.out.println("--- Ceytak KRS SIAKAD ---");
        System.out.print("Masukkan semster saat ini");
        int semester = latif23.nextInt();
        
        switch (semester) {
            case 1:
                System.out.println("KRS semster 1 ditampilkan");
                break;
            case 2: 
                System.out.println("KRS semster 2 ditampilkan");
                break;
            case 3: 
                System.out.println("KRS semster 3 ditampilkan");
                break;
            case 4:
                System.out.println("KRS smester 4 ditampilkan");
                break;
            case 5:
                System.err.println("KRS semster 5 ditampilkan");
                break;
            case 6:
                System.out.println("KRS semester 6 ditampilkan");
                break;
            case 7:
                System.out.println("KRS semster 7 ditampilkan");
                break;
            case 8:
                System.out.println("KRS semster 8 ditampilkan");
                break;    
            default:
                System.out.println("semester tidak valid");
        }
    }
    
}
