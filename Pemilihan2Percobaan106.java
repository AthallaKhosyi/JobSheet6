import java.util.Scanner;

public class Pemilihan2Percobaan106 {
    public static void main(String[] args) {
        Scanner Absen06 = new Scanner(System.in);

        System.out.print("Masukkan Tahun : ");
        int tahun = Absen06.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
            } else {
                // Cek khusus kelipatan 400 (seperti tahun 2000)
                if ((tahun % 400) == 0) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun Kabisat");
                }
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
        
        Absen06.close();
    }
}