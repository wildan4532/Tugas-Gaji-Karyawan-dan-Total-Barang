import java.util.Scanner;

public class gajiKaryawan {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input Jumlah Jam Kerja
        System.out.println("Masukkan Jam Kerja: ");
        int jamKerja = scanner.nextInt();

        //Input Tarif Per Jam
        System.out.println("Masukkan Tarif Per Jam: ");
        int tarifPerJam = scanner.nextInt();

        //Menghitung Gaji Bruto12
        int gajiBruto = jamKerja * tarifPerJam;

        //Menghitung Potongan Pajak
        double potonganPajak = gajiBruto * 0.10;

        //Menghitung Gaji Bersih
        double gajiBersih = gajiBruto - potonganPajak;

        //Hasil
        System.out.println("Gaji Bruto: " + gajiBruto);
        System.out.println("Potongan Pajak: " + potonganPajak);
        System.out.println("Gaji Bersih: " + gajiBersih);


    }
}
