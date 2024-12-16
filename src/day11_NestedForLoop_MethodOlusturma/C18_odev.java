package day11_NestedForLoop_MethodOlusturma;

public class C18_odev {
    public static void main(String[] args) {
        /*
              asagidaki sekli cizdirecek kodu yaziniz
               1
              1 2
             1 2 3
            1 2 3 4

         */

        for (int i = 1; i <=4 ; i++) {

            for (int j = 4; j > i ; j--)
            {
                System.out.print(" ");

            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(" "+ j );
            }System.out.println();
        }
    }
}
