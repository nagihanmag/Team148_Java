package day05_ifElseStatements;

import java.util.Scanner;

public class C01_BagimsizIfCumleleri {
    public static void main(String[] args) {

        // kullanicindan iki sayi isteyin
        // eger 1. sayi buyukse " Girilen ilk tam sayi daha yuyuktur"

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz...");
        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();

        if (sayi1>sayi2){
            System.out.println("Girilen ilk sayi daha buyuk");

        }

        //eger 2.sayi cift ise "Girilrn 2. sayi cift" yazdirin

        if (sayi2 %2 ==0){

            System.out.println("Girilen 2. sayi cift");

        }

        // sayi1 pozitifse "pozitif sayilar guzeldir"

        if (sayi1>0){
            System.out.println("Pozitif sayilar guzeldir");
        }






    }
}
