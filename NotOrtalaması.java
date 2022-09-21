package Giris;
import java.util.Scanner;

public class NotOrtalaması {

    public static void main (String[] args){

        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner inp =new Scanner(System.in);
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();
        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();
        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();
        System.out.print("Müzik Notunuz");
        muzik = inp.nextInt();

        int toplam =(mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc=toplam/6;

        int GecmeKosulu = 60;

        boolean kosul1 = sonuc == GecmeKosulu;
        boolean kosul2 = sonuc >= GecmeKosulu;
        boolean basaridurumu = kosul1 || kosul2;

        String Basari = basaridurumu ? "Sınıfı Geçtiniz :) " : "Sınıfta Kaldınız :( ";

        System.out.println(Basari);

    }
}
