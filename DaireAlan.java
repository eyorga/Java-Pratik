package Giris;
import java.util.Scanner;
public class DaireAlan {
    public static void main(String[] args) {

        int r ;
        double aci ;
        double pi = 3.14 ;
        double alan ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen Yarı Çap Giriniz : ");
        r = sc.nextInt();

        System.out.print("Lütfen Merkez Açı Ölçüsü Giriniz : ");
        aci = sc.nextInt();

        alan = (pi* (r * r) * aci ) / 360 ;

        System.out.println("Daire Diliminin Alanı :" + alan);
    }
}
