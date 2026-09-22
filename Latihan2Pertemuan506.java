import java.util.Scanner;

public class Latihan2Pertemuan506 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Masukkan data
        System.out.print("Masukkan Jenis Buku (Kamus/Novel/Lainnya): ");
        String jenisBuku = input.nextLine();

        System.out.print("Masukkan Jumlah Buku: ");
        int jumlahBuku = input.nextInt();

        System.out.print("Masukkan Total Harga Awal (Rp): ");
        double totalHargaAwal = input.nextDouble();

        double diskonPersen = 0;
        double totalBayar = 0;

        // 3. Pengecekan Jenis Buku sesuai flowchart
        if (jenisBuku.equalsIgnoreCase("Kamus")) {
            // Jalur Kamus
            if (jumlahBuku > 2) {
                diskonPersen = 12; // Total Diskon Kamus = 12%
            } else {
                diskonPersen = 10; // Total Diskon Kamus = 10%
            }
            totalBayar = totalHargaAwal - (totalHargaAwal * (diskonPersen / 100));

        } else if (jenisBuku.equalsIgnoreCase("Novel")) {
            // Jalur Novel
            if (jumlahBuku > 3) {
                diskonPersen = 9; // Diskon dasar 7% + ekstra 2% = 9%
            } else {
                diskonPersen = 8; // Diskon dasar 7% + ekstra 1% = 8%
            }
            totalBayar = totalHargaAwal - (totalHargaAwal * (diskonPersen / 100));

        } else {
            // Jalur Buku Lainnya
            if (jumlahBuku > 3) {
                diskonPersen = 5; // Total Diskon Lainnya = 5%
            } else {
                diskonPersen = 0; // Tidak Ada Diskon
            }
            totalBayar = totalHargaAwal - (totalHargaAwal * (diskonPersen / 100));
        }

        // 4. Output Total Bayar Akhir
        System.out.println("\n----------------------------------");
        System.out.println("Diskon yang didapat : " + diskonPersen + "%");
        System.out.println("Output : Total Bayar Akhir (Rp) = " + totalBayar);
        System.out.println("----------------------------------");

        input.close();
    }
}
