import java.util.Scanner;

public class Percobaan607 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.println("Masukkan Panjang : ");
        p = input.nextInt();
        System.out.println("Masukkan Lebar : ");
        l = input.nextInt();
        System.out.println("Masukkan Tinggi : ");
        t = input.nextInt();

        L = p * l;
        System.out.println("Luas persegi panjang adalah " + L);

        vol = p * l * t;
        System.out.println("Volume balok adalah " + vol);
    }

    static int hitungluas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungvolume(int tinggi, int a, int b) {
        int volume = hitungluas(a, b) * tinggi;
        return volume;
    }
}