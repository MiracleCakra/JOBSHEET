import java.util.Scanner;

public class DoWhileCuti07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti : ");
        jatahCuti = scan.nextInt();

        do{
            System.out.print("Apakah Anda ingin mengambil cuti (y/t) ? ");
            konfirmasi = scan.next();
            
            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari : ");
                jumlahHari = scan.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti : " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                

                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                break;
            } else {
                System.out.println("Input yang anda masukkan salah, coba Lagi!");
            }
        }   while (jatahCuti > 0);

        scan.close();
    }
    
}
