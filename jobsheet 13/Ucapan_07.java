import java.util.Scanner;

public class Ucapan_07 {

public static String Penerimaucapan(){
Scanner sc = new Scanner (System.in);
System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan : ");
String namaOrang = sc.nextLine();
sc.close();
return namaOrang;

}
public static void main(String[] args) {
    String nama = Penerimaucapan();
    System.out.println("Thank you " + nama + "\nMay the force be with you.");
    

}

}
