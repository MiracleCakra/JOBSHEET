import java.util.Scanner;

public class NestedLoop_2341720032 {
    public static void main (String [] args){
        
        Scanner scanner = new Scanner (System.in);
        double [][] temps = new double [5][7];
        double [] rata = new double [7];

        for (int i = 0 ; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i+1));
            double total = 0;
            for (int j = 0; j < temps [0].length; j++) {
                System.out.print("Hari ke-" + (j+1) + ": ");
                temps [i][j] = scanner.nextDouble();
                total += temps [i][j];
                
            }
            rata [i] = (double) total / temps[i].length;
            System.out.println();
        }
        int kota = 1;
        for (double[] temp : temps) {
            System.out.println("Kota ke-" + kota + " :");
            for (double hari : temp) {
                System.out.print(hari + " ");
            }
            System.out.println();
            System.out.println("Rata-rata suhu di kota ke-" + kota + "adalah" + rata[kota-1]);
            kota++;
        }
        System.out.println();
            }
           
        }

    
