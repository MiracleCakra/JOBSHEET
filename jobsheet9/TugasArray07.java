import java.util.Scanner;
public class TugasArray07 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int nilaiTertinggi, nilaiTerendah, i;
    double jumlah=0, ratarata;

    System.out.print("Masukkan berapa nilai yang akan dimasukkan: ");
    i = sc.nextInt();
    int nilai[] = new int [i]; 

    for (i=0; i < nilai.length; i++){
        System.out.print("Masukkan nilai ke-"+(i+1)+" : ");
        nilai[i]=sc.nextInt();
    }

    nilaiTertinggi=nilai[0];
    for (i=1; i < nilai.length; i++){
        if (nilai[i] > nilaiTertinggi) {
            nilaiTertinggi = nilai[i];
        }
    }
    nilaiTerendah=nilai[0];
    for (i=1; i < nilai.length; i++){
        if (nilai[i] < nilaiTerendah) {
            nilaiTerendah = nilai[i];
        }        
    }
    for (i=0; i < nilai.length; i++){
        jumlah+=nilai[i];
    }
    ratarata=jumlah/nilai.length;
    
    System.out.println("Nilai tertinggi adalah: "+nilaiTertinggi);
    System.out.println("Nilai terendah adalah : "+nilaiTerendah);
    System.out.println("Rata-ratanya adalah : "+ratarata);

    }
}