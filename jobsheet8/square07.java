import java.util.Scanner;

public class square07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int n07 = sc.nextInt();

        for (int i07 = 1; i07 <= n07; i07++) {
            System.out.print("*");

            for (int iOut07 = 1; iOut07 <= n07 ; iOut07++) {
                
                for (int iOut07 = 0; iOut07 <= n07; iOut07++) {
                    for (int i07=1 ; i07<=n07 ; i07++){
                    System.out.print("*");
                }
            }
        }
    }
}
}
