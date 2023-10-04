import java.util.*;
public class Pemilihan2Percobaan207 {
public static void main(String[] args) { Scanner input07 = new Scanner(System.in);

System.out.print("Masukkan sudut pertama segitiga\t : "); float sudut1 = input07.nextFloat(); 
System.out.print("Masukkan sudut kedua segitiga\t : "); float sudut2 = input07.nextFloat(); 
System.out.print("Masukkan sudut ketiga segitiga\t : "); float sudut3 = input07.nextFloat();

float totalSudut = sudut1 + sudut2 + sudut3;
if (totalSudut == 180) {
if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) { 
System.out.println("Segitiga tersebut adalah segitiga siku-siku");
} else if ((sudut1 == sudut2) && (sudut2 == sudut3)) {
System.out.println("Segitiga tersebut adalah Segitiga sama sisi");
} else if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut1 == sudut3)) {
System.out.println("Segitiga tersebut adalah Segitiga sama kaki");
} else
System.out.println("Segitiga tersebut adalah segitiga sembarang");
} else
System.out.println("Bukan Segitiga");
}
}
