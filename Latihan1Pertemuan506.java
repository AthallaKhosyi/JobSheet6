import java.util.Scanner;

public class Latihan1Pertemuan506 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int terbesar;

        // Input 3 angka
        System.out.print("Masukkan Bilangan 1: ");
        int bil1 = input.nextInt();

        System.out.print("Masukkan Bilangan 2: ");
        int bil2 = input.nextInt();

        System.out.print("Masukkan Bilangan 3: ");
        int bil3 = input.nextInt();

        // Pengecekan sesuai alur 
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

        // Cetak hasil
        System.out.println("Bilangan Terbesar : " + terbesar);

        input.close();
    }
}
