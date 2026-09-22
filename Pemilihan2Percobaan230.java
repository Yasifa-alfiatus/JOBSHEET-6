import java.util.Scanner;

public class Pemilihan2Percobaan230 {
    public static void main(String[] args) {
        Scanner yasifa = new Scanner(System.in);

        int menu;
        int harga;
        double diskon = 0.10;
        String member;
        String pembayaran;
        double total_bayar;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-------------------------");

        System.out.print("Masukan angka dari Menu yang dipilih = ");
        menu = yasifa.nextInt();
        yasifa.nextLine();

        System.out.print("Apakah anda member? (y/n) = ");
        member = yasifa.nextLine();

        System.out.print("Metode pembayaran (QRIS/Tunai) = ");
        pembayaran = yasifa.nextLine();

        System.out.println("----------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");

            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling = " + harga);

            } else {
                System.out.println("Masukan pilihan menu dengan benar");
                return;
            }

            total_bayar = harga - (harga * diskon);

            if (pembayaran.equalsIgnoreCase("QRIS")) {
                total_bayar = total_bayar - 1000;
                System.out.println("Potongan QRIS = Rp1000");
            }

            System.out.println("Total Bayar = " + total_bayar);

        } else if (member.equalsIgnoreCase("n")) {

            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling = " + harga);

            } else {
                System.out.println("Masukan pilihan menu dengan benar");
                return;
            }

            total_bayar = harga;

            if (pembayaran.equalsIgnoreCase("QRIS")) {
                total_bayar = total_bayar - 1000;
                System.out.println("Potongan QRIS = Rp1000");
            }

            System.out.println("Total Bayar = " + total_bayar);

        } else {
            System.out.println("Member tidak valid");
        }

        System.out.println("----------------------------");
    }
}