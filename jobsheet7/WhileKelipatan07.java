import java.util.Scanner;

public class WhileKelipatan07 {
    public static void main (String[] args ) {
        Scanner scan = new Scanner(System.in); 

        int kelipatan, total = 0, counter = 0; 
        double rata;

        System.out.print("Masukkan bilangan kelipatan (1-9) : "); 
        kelipatan = scan.nextInt(); 
        
        int i = 1;
        while (i <= 50) { 
            i++;
            if (i % kelipatan == 0) { 
                total += i; 
                counter++;
                rata = total / counter;
            }
        }

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter); 
        System.out.printf("total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total); 
        System.out.printf("rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %2f\n", kelipatan, rata);

            }  
}

