package day10_Forloop;

import java.util.Scanner;

public class C13_StringTerstenYazdırma {
    public static void main(String[] args) {

        // Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");

        String metin = scanner.nextLine();


        for (int i = metin.length()-1 ; i >=0 ; i--) {

            System.out.print(metin.charAt(i));
        }
    }
}
