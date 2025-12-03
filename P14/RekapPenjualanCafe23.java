package P14;
import java.util.Scanner;

public class RekapPenjualanCafe23 {
    
    public static void inputDataPenjualan(int[][] penjualan, String[] menu, int jumlahHari) {
        Scanner latif23 = new Scanner(System.in);
        
        System.out.println("=== INPUT DATA PENJUALAN ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("\nMenu: " + menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = latif23.nextInt();
            }
        }
    }
    
    public static void tampilkanDataPenjualan(int[][] penjualan, String[] menu, int jumlahHari) {
        System.out.println("\n=== REKAP PENJUALAN KAFE IBU MARIANA ===");
        System.out.println("=".repeat(80));
        
        System.out.printf("%-20s", "Menu");
        for (int j = 0; j < jumlahHari; j++) {
            System.out.printf("| Hari ke %-2d ", (j + 1));
        }
        System.out.println("|");
        System.out.println("=".repeat(80));
        
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-20s", menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.printf("|     %-6d ", penjualan[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("=".repeat(80));
    }
    
    public static void tampilkanMenuTertinggi(int[][] penjualan, String[] menu) {
        int maxTotal = 0;
        String menuTertinggi = "";
        
        System.out.println("\n=== TOTAL PENJUALAN SETIAP MENU ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            System.out.printf("%-20s: %d\n", menu[i], total);
            
            if (total > maxTotal) {
                maxTotal = total;
                menuTertinggi = menu[i];
            }
        }
        
        System.out.println("\n>>> Menu dengan penjualan TERTINGGI: " + menuTertinggi);
        System.out.println(">>> Total penjualan: " + maxTotal + " porsi");
    }
    
    public static void tampilkanRataRata(int[][] penjualan, String[] menu) {
        System.out.println("\n=== RATA-RATA PENJUALAN SETIAP MENU ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / penjualan[i].length;
            System.out.printf("%-20s: %.2f porsi/hari\n", menu[i], rataRata);
        }
    }
    
    public static void main(String[] args) {
        Scanner rifat28 = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah hari penjualan: ");
        int jumlahHari = rifat28.nextInt();
        
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = rifat28.nextInt();
        rifat28.nextLine();
        
        String[] menu = new String[jumlahMenu];
        System.out.println("\nMasukkan nama menu:");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Menu ke-" + (i + 1) + ": ");
            menu[i] = rifat28.nextLine();
        }
        
        int[][] penjualan = new int[jumlahMenu][jumlahHari];
        
        inputDataPenjualan(penjualan, menu, jumlahHari);
        
        tampilkanDataPenjualan(penjualan, menu, jumlahHari);
        
        tampilkanMenuTertinggi(penjualan, menu);
        
        tampilkanRataRata(penjualan, menu);
        
        rifat28.close();
    }
}