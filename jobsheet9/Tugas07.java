import java.util.Arrays;
import java.util.Scanner;

public class Tugas07 {
    public static void main(String [] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah elemen : ");
        int jumlahElemen = sc.nextInt();

        int [] nilai = nilai = new int [jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan Nilai ke-" + (i + 1) + " : ");
            nilai[i] = sc.nextInt();
        }
        
        Arrays.sort(nilai);

        int nilaiTertinggi = nilai[jumlahElemen - 1];
        int nilaiTerendah = nilai[0];
        double total = 0;

        for (int i = 0; i < jumlahElemen; i++) {
            total += nilai[i];
        }
    
        double rataRata = total / jumlahElemen;

        System.out.println("Nilai Tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai Terendah : " + nilaiTerendah);
        System.out.println("Nilai rata-rata : " + rataRata);

    }

}