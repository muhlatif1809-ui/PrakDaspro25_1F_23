package P10;

import java.util.Scanner;

public class Star23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);

        System.out.print("Masukkan Nilai n =");
        int n = latif23.nextInt();
        
        for (int i = 1; i <= n; i+=2) {
            System.out.print("*");
            
        }
    }
    
}
