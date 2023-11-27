import java.util.Scanner;

public class UcapanTerimakasih_07 {
    public static void UcapanTerimakasih(String nama) {
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n"
        + "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan : ");
        String penerima = sc.nextLine();
        UcapanTerimakasih(penerima);

        System.out.println("Tuliskan UCAPAN TAMBAHAN yang ingin anda sampaikan : ");
        String ucapan = sc.nextLine();

        sc.close();
    }
}