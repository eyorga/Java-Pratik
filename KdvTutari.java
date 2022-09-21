package Giris;
import java.util.Scanner;
public class KdvTutari {
    public static void main(String[] args) {

        double number ;
        double kdvOran ;
        double kdvTutar ;
        double kdvToplam;
        Scanner sc = new Scanner (System.in);
        System.out.println("Lutfen Kdv Hesaplamak İçin Tutar Giriniz: ");
        number = sc.nextDouble();


        kdvOran = (number <= 1000)? 0.18 : 0.08; //ürünün fiyatı 1000 TL'den düşükse kdv %18, değilse kdv %8

        kdvTutar = number * kdvOran; //ürünün kdv tutarını hesaplama
        kdvToplam = number + kdvTutar; //kdvli fiyat hesaplama

        System.out.println(" KDV siz FiyatI: " +number);
        System.out.println(" KDV Oranı: " +kdvOran);
        System.out.println(" KDV li Fiyatı: " + kdvTutar);
        System.out.println(" KDV Tutarı: " + kdvToplam);

    }
}
