import java.util.Scanner;

public class Pemilihan2Percobaan206 {
    public static void main(String[] args) {
        // Deklarasi Scanner dengan identitas Absen (contoh menggunakan absen 15)
        Scanner Absen06 = new Scanner(System.in);

        // Deklarasi variabel
        int pilihan_menu;
        String member;
        double diskon, harga = 0, total_bayar;
        String metode_pembayaran; // Tambahan variabel baru

        // Tampilan Menu Kafe JTI
        System.out.println("--------------------------------");
        System.out.println("====== MENU KAFE JTI ======");
        System.out.println("--------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------");

        // Input pilihan menu
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = Absen06.nextInt();
        Absen06.nextLine(); // Membersihkan buffer enter

        // Input status member
        System.out.print("Apakah punya member (y/n) ? = ");
        member = Absen06.nextLine();

        // Input metode pembayaran (Tambahan baru)
        System.out.print("Masukkan metode pembayaran (QRIS/Cash) = ");
        metode_pembayaran = Absen06.nextLine();
        System.out.println("--------------------------------");

        // Struktur Kondisi Pertama -> Jika pembeli memiliki member ('y' atau 'Y')
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");

            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                Absen06.close();
                return; // Menghentikan eksekusi jika pilihan menu salah
            }

            // Menghitung total bayar setelah diskon
            total_bayar = harga - (harga * diskon);

            // Cek jika pembayaran menggunakan QRIS (Tambahan baru)
            if (metode_pembayaran.equalsIgnoreCase("QRIS")) {
                total_bayar -= 1000;
                System.out.println("Dapat potongan QRIS = Rp. 1000");
            }

            System.out.println("Total bayar setelah diskon = " + total_bayar);

        // Struktur Kondisi Kedua -> Jika pembeli tidak memiliki member ('n' atau 'N')
        } else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                Absen06.close();
                return; // Menghentikan eksekusi jika pilihan menu salah
            }

            // Menghitung total bayar tanpa diskon member
            total_bayar = harga;

            // Cek jika pembayaran menggunakan QRIS (Tambahan baru)
            if (metode_pembayaran.equalsIgnoreCase("QRIS")) {
                total_bayar -= 1000;
                System.out.println("Dapat potongan QRIS = Rp. 1000");
            }

            System.out.println("Total bayar = " + total_bayar);

        } else {
            System.out.println("Member tidak valid!");
        }

        System.out.println("--------------------------------");
        Absen06.close();
    }
}