import java.util.Scanner;

public class PenjumlahanRekursif07 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan nilai f :");
        int f = sc.nextInt();

        int Hasil = PenjumlahanRekursif(f);

        System.out.println("Hasil penjumlahan dari 1 sampai " + f + " adalah : " + Hasil);
        
        System.out.println("Deret perhitungan penjumlahan bilangan adalah :");
        cetakDeretPenjumlahan(f);
    }

    //Fungsi rekursif untuk menghitung penjumlahan
    static int PenjumlahanRekursif(int n) {
      if (n <= 0){
        return 0;
      }else{
        return n + PenjumlahanRekursif(n-1);
      }
    }

    //fungsi untuk mencetak deret perhitungan
    static void cetakDeretPenjumlahan(int n){
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print(" + ");
                
            }
        }
        System.out.print(" = " + PenjumlahanRekursif(n));
    }
}