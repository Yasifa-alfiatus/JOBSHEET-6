import java.util.Scanner;

public class PemilihanSepatu30 {
    public static void main(String[] args) {

        Scanner yasifa = new Scanner(System.in);

        String merk, kategori;
        int ukuran;
        int harga = 0;

        System.out.print("Masukkan Merk Sepatu : ");
        merk = yasifa.nextLine();

        System.out.print("Masukkan Kategori : ");
        kategori = yasifa.nextLine();

        System.out.print("Masukkan Ukuran : ");
        ukuran = yasifa.nextInt();

        if (merk.equalsIgnoreCase("Converse")) {

            if (kategori.equalsIgnoreCase("Slip On")) {
                harga = 800000;
            } else if (kategori.equalsIgnoreCase("High Top")) {
                harga = 1200000;
            }

        } else if (merk.equalsIgnoreCase("Sketcher")) {

            if (kategori.equalsIgnoreCase("Woman")) {
                harga = 1000000;
            } else if (kategori.equalsIgnoreCase("Man")) {
                harga = 1800000;
            }

        } else if (merk.equalsIgnoreCase("Nike")) {

            if (kategori.equalsIgnoreCase("Kids")) {
                harga = 750000;
            } else if (kategori.equalsIgnoreCase("Adult")) {
                harga = 1500000;
            }

        } else {
            System.out.println("Merk tidak tersedia");
            return;
        }

        System.out.println("Harga Sepatu = Rp " + harga);

    }
}
