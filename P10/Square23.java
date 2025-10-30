package P10;

import java.util.Scanner;

public class Square23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);

        System.out.print("Masukkan Nilai N = ");
        int N = latif23.nextInt();

        for (int i = 0; i <=N; i++) {
            for (int j = 1; j <=N; j++) {
                System.out.print("*");
            }
                System.out.println();
        }
            
    }
    
}
