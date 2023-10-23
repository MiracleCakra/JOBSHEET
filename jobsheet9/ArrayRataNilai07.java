import java.util.Scanner;

public class ArrayRataNilai07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0;
        double rata2Lulus;
        int jumlahLulus = 0;
        double totalTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
            }
        }
        rata2Lulus = totalLulus / jumlahLulus;
        System.out.println("Rata-rata Nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata Nilai tidak lulus = " + (totalTidakLulus / (nilaiMhs.length - jumlahLulus)));
    }
}