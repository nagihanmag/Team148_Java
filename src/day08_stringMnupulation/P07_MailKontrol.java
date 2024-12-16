package day08_stringMnupulation;

import java.util.Scanner;

public class P07_MailKontrol {
    public static void main(String[] args) {

         /*

    SORU : kullanicidan bir mail alin
  - mail @ icermiyorsa “gecersiz mail”
  - mail @gmail.com icermiyorsa, “mail gmail olmali”
  - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
    yazdirin

     */

            Scanner scan=new Scanner(System.in);
            System.out.print("Mail adresinizi giriniz: ");
            String mail=scan.nextLine();

            if (!mail.contains("@")){
                System.out.println("Geçersiz Mail");
            }

            if (!mail.contains("@gmail.com")){
                System.out.println("mail gmail olmali");
            }
            if (!mail.endsWith("@gmail.com")){
                System.out.println("mailde yazim hatasi var");
            }

            //ÖDEV: soruyu aynı şartlarda if else statements ile çözün





    }
}
