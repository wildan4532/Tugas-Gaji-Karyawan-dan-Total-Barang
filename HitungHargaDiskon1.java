import java.util.Scanner;

public class HitungHargaDiskon1 {
    public static void main(String[] args) {
        double hargaAwal, diskon, totalHarga;
        int jumlahBarangl;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Masukkan Harga Barang: ");
            hargaAwal = scan.nextDouble();
            System.out.println("Masukkan Diskon (tanpa %): ");
            diskon = scan.nextDouble();
            System.out.println("Masukkan Jumlah Barang Yang Dibei: ");
            jumlahBarangl = scan.nextInt();
        }

        totalHarga = hargaAwal*jumlahBarangl;
        diskon = (diskon / 100) * totalHarga;
        totalHarga = totalHarga - diskon;
        System.out.println("Harga Setelah Diskon Yaitu: Rp. " + totalHarga + "00");
    
       
    }
}