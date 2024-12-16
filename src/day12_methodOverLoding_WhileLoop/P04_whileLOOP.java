package day12_methodOverLoding_WhileLoop;

import java.util.Scanner;

public class P04_whileLOOP {
    public static void main(String[] args) {

        //While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int rakamlarToplami = 0 ;

        while (sayi>0){
            rakamlarToplami+=sayi%10;
            sayi =sayi/10;
        }
        System.out.println("Rakamlar toplami ="+ rakamlarToplami);


        //ÖDEV:While loop kullanarak verilen bir String’i terse cevirip,
        // bu halini bize donduren bir method olusturun.
    }
}
