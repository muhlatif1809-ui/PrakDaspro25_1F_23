package P14;

public class programKu23 {
    public static void TampilHitunganKei(int i ) {
        for (int j = 0; j <= i; j++) {
            System.out.print(j);
        }
    }

    public static int Jumlah (int bill, int bill2){
        return (bill + bill2);
    }

    public static void TampilJumlah(int bill, int bill2) {
        TampilHitunganKei(Jumlah(bill, bill2));
    }

    public static void main(String[] args) {
        int temp = Jumlah(1, 1);
        TampilHitunganKei(5);
    }
}
