import java.util.Scanner;

public class ArrayDua207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris : ");
        int baris07 = sc.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        int kolom07 = sc.nextInt();
        System.out.println("-------------------------------------------");

        String[][] pengunjung07 = new String[baris07][kolom07];
        sc.nextLine(); 

        for (int baris07 = 0; baris07 < pengunjung07.length; baris07++) {
            for (int kolom07 = 0; kolom07 < pengunjung07[0].length; kolom07++) {
                System.out.print("Masukkan nama pengunjung [" + baris07 + "][" + kolom07 + "]: ");
                pengunjung07[baris07][kolom07] = sc.nextLine();
            }
            System.out.println("-------------------------------------------");
        }

        for (int baris07 = 0; baris07 < pengunjung07.length; baris07++) {
            for (int kolom07 = 0; kolom07 < pengunjung07[0].length; kolom07++) {
                System.out.printf("%s\t", pengunjung07[baris07][kolom07]);
            }
            System.out.println("");
            System.out.println(pengunjung07.length);
            System.out.println(pengunjung07[0].length);
        }
    }
}