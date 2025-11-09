package P11;

import java.util.Scanner;

public class Tugas1_23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : "); 
        int banyakMhs = latif23.nextInt();
        int nilaiMhs [] = new int[banyakMhs];
        double rata2, total = 0, nilaiTertinggi = 0, nilaiTerendah = 100;

        for (int i = 0; i < banyakMhs; i++) {
            System.out.print("Masukkan Nilai Nilai Mahasiswa ke- "+(i+1)+ " : ");
            nilaiMhs [i] = latif23.nextInt();  
            total += nilaiMhs[i];
                    
            if (nilaiMhs[i] >= nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];   
            }
       
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];   
            }
        }
        rata2 = total / nilaiMhs.length;
        System.out.println("Rata Rata Nilai : "+ rata2 );
        System.out.println("Nilai Teringgi : "+ nilaiTertinggi);
        System.out.println("Nilai Terendah : "+ nilaiTerendah);
        for (int i = 0; i < banyakMhs; i++) {
            System.out.println("Nilai Mahasiswa ke - "+ (i+1)+ " Adalah : "+ nilaiMhs[i]);
        }
            
    } 
        
}
    

            
        
    





    

