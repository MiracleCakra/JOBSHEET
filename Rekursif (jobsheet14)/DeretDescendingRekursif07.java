import java.util.Scanner;

public class DeretDescendingRekursif07 {
   
    //fungsi Rekursif
    static void DescendingRekursif (int n) {
        if (n < 0){
            return;
    }
    System.out.println(n);
    DescendingRekursif(n-1);
   
    }

    //fungsi Iteratif
    static void printDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print(" Masukkan angka : ");
        int angka = sc.nextInt();

        System.out.println("Output rekursif : ");
        DescendingRekursif (angka);

        System.out.println("Output iteratif : ");
        printDescendingIteratif(angka);
    }
}

