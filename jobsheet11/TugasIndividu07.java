import java.util.Scanner;

public class TugasIndividu07 {
    public static void main (String []args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3) : ");
        int N = input.nextInt(); // Jumlah baris

        for (int i = 1; i <= N ; i++) {
            //Membuat spasi 
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N + " ");
                    
                } else {
                   System.out.print("  ");
                } 
            
            }
            System.out.println();
        }
    }
}
