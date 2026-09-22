import java.util.Scanner;

public class DiskonBuku30 {
    public static void main(String[] args) {

        Scanner yasifa = new Scanner(System.in);

        String jenisBuku;
        int jumlah;
        double totalBelanja;
        double diskon = 0;
        double potongan;
        double totalBayar;

        System.out.print("Masukkan jenis buku : ");
        jenisBuku = yasifa.nextLine();

        System.out.print("Masukkan jumlah buku : ");
        jumlah = yasifa.nextInt();

        System.out.print("Masukkan total belanja : ");
        totalBelanja = yasifa.nextDouble();

        if (jenisBuku.equalsIgnoreCase("kamus")) {

            if (jumlah > 2) {
                diskon = 0.12; 
            } else {
                diskon = 0.10;
            }

        } else if (jenisBuku.equalsIgnoreCase("novel")) {

            if (jumlah > 3) {
                diskon = 0.09; 
            } else {
                diskon = 0.08; 
            }

        } else {

            if (jumlah > 3) {
                diskon = 0.05;
            } else {
                diskon = 0;
            }

        }

        potongan = totalBelanja * diskon;
        totalBayar = totalBelanja - potongan;

        System.out.println("\nJumlah Diskon = " + (diskon * 100) + "%");
        System.out.println("Potongan Harga = Rp" + potongan);
        System.out.println("Total Bayar = Rp" + totalBayar);

    }
}
