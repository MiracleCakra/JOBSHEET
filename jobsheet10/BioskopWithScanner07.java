import java.util.Scanner;

public class BioskopWithScanner07 {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    String [][] penonton = new String[4][2];

    while (true) {
        System.out.println("Menu:");
        System.out.println("1. Input data penonton");
        System.out.println("2. Tampilkan data penonton");
        System.out.println("3. Exit");
        System.out.print("Pilih menu:");
        int menu = sc.nextInt();
        sc .nextLine();

        switch (menu) { 
            case 1:

    do {
        System.out.print("Masukkan nama :");
        String nama = sc.nextLine();
        System.out.print("Masukkan baris :");
        int baris = sc.nextInt();
        System.out.print("Masukkan kolom :");
        int kolom = sc.nextInt();
        
        if (baris > 0 && baris <= 4 && kolom > 0 && kolom <= 2) {
           if (penonton[baris-1][kolom-1] == null) {
             penonton[baris-1][kolom-1] = nama;  
        
           }else{
               System.out.println("Mohon Maaf, kursi baris " + baris + ", kolom " + kolom + " sudah ditempati.");
           }

        } else {
            System.out.println("Baris atau kolom tidak tersedia.");
        }
        System.out.print("Input penonton lainya? (y/n): ");
        sc.nextLine();

        } while (!sc.nextLine().equalsIgnoreCase("n"));
        break;

        case 2:
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0 ; j < penonton[i].length; j++) {
                String tampilan = penonton[i][j] != null ? penonton[i][j] : "***";
                System.out.printf("Penonton baris %d, kolom %d : %s\n", i+1, j+1, tampilan);
        }
    }
        break;

        case 3:
        System.out.println("TERIMA KASIH");
        System.exit(0);
        default:
        System.out.println("Pilihan tidak valid.");
        break;
        }
    }
        
    }
}

    
