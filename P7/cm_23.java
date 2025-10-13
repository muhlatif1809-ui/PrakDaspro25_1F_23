package P7;

import java.util.Scanner;

public class cm_23 {
     public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);
        String nama_mahasiswa, nim;
        int nilai_Pancasila, nilai_Daspro, nilai_Bing;
        int sksPancasila = 2;
        int sksDaspro = 3;
        int sksBing = 2;
        System.out.println("===== INPUT MAHASISWA =====");
        System.out.print("Nama : ");
        nama_mahasiswa = latif23.nextLine(); 
        System.out.print("Nim : ");
        nim = latif23.nextLine();
        System.out.println("");

        System.out.println("Masukan Nilai Angka (0 - 100): ");
        System.out.print("Pancasila : ");
        nilai_Pancasila = latif23.nextInt();
        System.out.print("Dasar Pemorgramman : ");
        nilai_Daspro = latif23.nextInt();
        System.out.print("Bahasa Inggris : ");
        nilai_Bing = latif23.nextInt();

        if (nilai_Pancasila < 0 == nilai_Pancasila > 100) {
            System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100");
        } else if(nilai_Daspro < 0 == nilai_Daspro > 100){
            System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100");
        } else if(nilai_Bing < 0 == nilai_Bing > 100){
            System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100");
        }

        String nilaiHurufP, nilaiHurufD, nilaiHurufB;
        if (nilai_Pancasila > 80 && nilai_Pancasila <= 100){    
            nilaiHurufP = "A";
        }else if(nilai_Pancasila > 73 && nilai_Pancasila <=80){
            nilaiHurufP = "B+";
        }else if(nilai_Pancasila > 65 && nilai_Pancasila <= 73){
            nilaiHurufP = "B";
        }else if(nilai_Pancasila > 60 && nilai_Pancasila <= 65){
            nilaiHurufP = "C+";
        }else if(nilai_Pancasila > 50 && nilai_Pancasila <= 60){
            nilaiHurufP = "C";
        }else if(nilai_Pancasila > 39 && nilai_Pancasila <= 50){
            nilaiHurufP = "D";
        }else{
            nilaiHurufP = "E";
        }

        if (nilai_Daspro > 80 && nilai_Daspro <= 100){    
            nilaiHurufD = "A";
        }else if(nilai_Daspro > 73 && nilai_Daspro <=80){
            nilaiHurufD = "B+";
        }else if(nilai_Daspro > 65 && nilai_Daspro <= 73){
            nilaiHurufD = "B";
        }else if(nilai_Daspro > 60 && nilai_Daspro <= 65){
            nilaiHurufD = "C+";
        }else if(nilai_Daspro > 50 && nilai_Daspro <= 60){
            nilaiHurufD = "C";
        }else if(nilai_Daspro > 39 && nilai_Daspro <= 50){
            nilaiHurufD = "D";
        }else{
            nilaiHurufD = "E";
        }

        if (nilai_Bing > 80 && nilai_Bing <= 100){    
            nilaiHurufB = "A";
        }else if(nilai_Bing > 73 && nilai_Bing <=80){
            nilaiHurufB = "B+";
        }else if(nilai_Bing > 65 && nilai_Bing <= 73){
            nilaiHurufB = "B";
        }else if(nilai_Bing > 60 && nilai_Bing <= 65){
            nilaiHurufB = "C+";
        }else if(nilai_Bing > 50 && nilai_Bing <= 60){
            nilaiHurufB = "C";
        }else if(nilai_Bing > 39 && nilai_Bing <= 50){
            nilaiHurufB = "D";
        }else{
            nilaiHurufB = "E";
        }

        double nilaiSetaraP, nilaiSetaraD, nilaiSetaraB;
        if(nilaiHurufP.equals("A")){
            nilaiSetaraP = 4;
        }else if(nilaiHurufP.equals("B+")){
            nilaiSetaraP = 3.5;
        }else if(nilaiHurufP.equals("B")){
            nilaiSetaraP = 3;
        }else if(nilaiHurufP.equals("C+")){
            nilaiSetaraP = 2.5;
        }else if(nilaiHurufP.equals("C")){
            nilaiSetaraP = 2;
        }else if(nilaiHurufP.equals("D")){
            nilaiSetaraP = 1;
        }else{
            nilaiSetaraP = 0;
        }

        if(nilaiHurufD.equals("A")){
            nilaiSetaraD = 4;
        }else if(nilaiHurufD.equals("B+")){
            nilaiSetaraD = 3.5;
        }else if(nilaiHurufD.equals("B")){
            nilaiSetaraD = 3;
        }else if(nilaiHurufD.equals("C+")){
            nilaiSetaraD = 2.5;
        }else if(nilaiHurufD.equals("C")){
            nilaiSetaraD = 2;
        }else if(nilaiHurufD.equals("D")){
            nilaiSetaraD = 1;
        }else{
            nilaiSetaraD = 0;
        }

        if(nilaiHurufB.equals("A")){
            nilaiSetaraB = 4;
        }else if(nilaiHurufB.equals("B+")){
            nilaiSetaraB = 3.5;
        }else if(nilaiHurufB.equals("B")){
            nilaiSetaraB = 3;
        }else if(nilaiHurufB.equals("C+")){
            nilaiSetaraB = 2.5;
        }else if(nilaiHurufB.equals("C")){
            nilaiSetaraB = 2;
        }else if(nilaiHurufB.equals("D")){
            nilaiSetaraB = 1;
        }else{
            nilaiSetaraB = 0;
        }

        System.out.println("==========================================================================");
        System.out.println("                        Hasil Konversi Nilai                              ");
        System.out.println("==========================================================================");
        System.out.println("Nama : " + nama_mahasiswa);
        System.out.println("NIM  : " + nim);
        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Mata Kuliah                SKS   Nilai   Huruf   Setara");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Pancasila                  2     " + nilai_Pancasila + "      " + nilaiHurufP + "       " + nilaiSetaraP);
        System.out.println("Dasar Pemrograman          3     " + nilai_Daspro + "      " + nilaiHurufD + "       " + nilaiSetaraD);
        System.out.println("Bahasa Inggris             2     " + nilai_Bing + "      " + nilaiHurufB + "       " + nilaiSetaraB);
        System.out.println("--------------------------------------------------------------------------");

        double totalSKS = 2 + 3 + 2;
        double totalNilai = (nilaiSetaraP * sksPancasila) + (nilaiSetaraD * sksDaspro) + (nilaiSetaraB * sksBing);
        double ip = totalNilai / totalSKS;
        double bobot = totalNilai;

        System.out.println("Total SKS : "+ totalSKS);
        System.out.println("Bobot : " + bobot);
        System.out.println(String.format("%.2f",ip));

        String status;

        if (nilaiHurufP.equals("D") || nilaiHurufP.equals("E")) {
            status = "TIDAK LULUS SEMESTER (Nilai Pancasila D/E)";
        }else if (ip < 2) {
            status = "TIDAK LULUS SEMESTER (IP kurang dari 2)";
        }else if (nilai_Pancasila >= 60 && nilai_Daspro >= 60 && nilai_Bing >= 60) {
            status = "LULUS SEMESTER";
        }else {
            status = "TIDAK LULUS SEMESTER";
        }
        System.out.println("Status Semester : " + status);
    }
}
        
        
                
            
            
            
            
        

        
            
        

        
                
            
            

            
        

       


    
    

