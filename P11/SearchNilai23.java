package P11;

import java.util.Scanner;

public class SearchNilai23 {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);
        System.out.print("Masukkan Nilai Yang Akan Di Input : ");
        int nilai = latif23.nextInt();
        int[] arrNilai = new int[nilai];
        int key = 0, hasil = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke - " +(i+1)+ " : ");
            arrNilai [i] = latif23.nextInt();    
        }
        System.out.print("Masukkan Nilai Yang Ingin Dicari : ");
        key = latif23.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i + 1;
                break;  
            }
            
        }
        if (hasil != 0) {
            System.out.println();
            System.out.println("Nilai "+key+ " Ketemu, Merupakan Nilai  Mahasiswa Ke-" + hasil);
            System.out.println();
                
        } else {
            System.out.println();
            System.out.println("Nilai Yang Dicari Tidak Ditemukan");
            System.out.println();
        }
            
    }
    
}
