import java.util.Scanner;
public class Latihan3Pertemuan506 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data sepatu
        System.out.print("Masukkan Merk Sepatu: ");
        String merk = input.nextLine();

        System.out.print("Masukkan Kategori Sepatu: ");
        String kategori = input.nextLine();

        System.out.print("Masukkan Ukuran Sepatu: ");
        int ukuran = input.nextInt();

        long harga = 0;

        // Pengecekan Merk Converse
        if (merk.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip On")) {
                harga = 800000;
            } else {
                harga = 1200000;
            }
        } 
        // Pengecekan Merk Sketcher
        else if (merk.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                harga = 1000000;
            } else if (kategori.equalsIgnoreCase("Kids")) {
                harga = 750000;
            } else {
                harga = 1500000;
            }
        }

        // Output Harga Sepatu
        System.out.println("\nOutput : Harga Sepatu = Rp " + harga);

        input.close();
    }
}

