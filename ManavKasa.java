package Giris;

import java.util.Scanner;

public class ManavKasa {

    public static void main(String[] args) {

        double armut=2.14 , elma=3.67 , domates=1.11 , muz=0.95 , patlican=5 ;
        int karmut,kelma,kdomates,kmuz,kpatlican ;
        double toplamSepet ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? ");
        karmut = sc.nextInt();
        System.out.print("Elma Kaç Kilo ? ");
        kelma = sc.nextInt();
        System.out.print("Domates Kaç Kilo ? ");
        kdomates = sc.nextInt();
        System.out.print("Muz Kaç Kilo ? ");
        kmuz = sc.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? ");
        kpatlican = sc.nextInt();


        toplamSepet = ((armut*karmut)+ (elma*kelma)+(domates*kdomates)+(muz*kmuz)+ (patlican*kpatlican));

        System.out.print("Toplam Tutar: " + toplamSepet);
        System.out.print(" TL");

    }
}
