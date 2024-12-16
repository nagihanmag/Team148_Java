package day03_dataCasting_WrapperClass;

import java.util.Scanner;

public class C03_Ornek {
    public static void main(String[] args) {

        // kullanicidan iki tam sayi ilin
        //birinci tam sayiyi ikinci tam sayiya bolun
        // ve sonucu ondalikli olarak yazin

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lutfen 2 tam sayi giriniz...");

        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();

        System.out.println("iki sayinin bolum sonucu :"+(sayi1/sayi2));

        // Java iki tam sayiyi boldugunde sonucun sadece tamsayi kismini yazdirir


        System.out.println("iki sayinin bolum sonucu :"+(double)(sayi1/sayi2));
        // Java once bolme islemi yapip sonra test ettigi icin 12.0 yazdirdi

        System.out.println("iki sayinin bolum sonucu :"+((double)sayi1/sayi2)); //sayi1 double yapinca





    }
}
