import java.util.Scanner;

public class Pemilihan2Percobaan130 {
    public static void main(String[] args) {
        Scanner yasifa = new Scanner(System.in);
        int tahun;

        System.out.print("Masukkan Tahun: ");
        tahun = yasifa.nextInt();

        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun Kabisat");
                }
            } else {
                System.out.println("Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}