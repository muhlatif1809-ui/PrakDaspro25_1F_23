package P10;

import java.util.Scanner;

public class Triangle23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);
         System.out.print("Masukkan Nilai N = ");
        int n = latif23.nextInt();
        int i = 0;

        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;            
            }
            i++;
        }   
    
    }
}

  