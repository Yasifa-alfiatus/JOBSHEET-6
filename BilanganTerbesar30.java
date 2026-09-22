import java.util.Scanner;

public class BilanganTerbesar30 {
    public static void main(String[] args) {

        Scanner yasifa = new Scanner(System.in);

        int bil1, bil2, bil3, terbesar;

        System.out.print("Masukkan Bilangan 1 : ");
        bil1 = yasifa.nextInt();

        System.out.print("Masukkan Bilangan 2 : ");
        bil2 = yasifa.nextInt();

        System.out.print("Masukkan Bilangan 3 : ");
        bil3 = yasifa.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                terbesar = bil1;
            } else {
                terbesar = bil3;
            }
        } else {
            if (bil2 > bil3) {
                terbesar = bil2;
            } else {
                terbesar = bil3;
            }
        }

        System.out.println("Bilangan terbesar : " + terbesar);

    }
}
