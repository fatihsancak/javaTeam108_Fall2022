package Day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {

        /*
        char data türünün ekstra bir özelliği vardır.
        eğer matematiksel bir işlem de char data  türünden bir değer kullanılırsa
        Java o char'ın ascii degerini gözönünde bulundurarak
        matematiksel işlemi gerçekleştirir.
         */
        System.out.println('a' + 'b'); // 97 + 98 = 195

        System.out.println('a' - 32); // 97 - 32 = 65

        // 'a'-32'nin char olarak sonucunu yazdırın
        System.out.println((char)('a'-32)); // A

        // kullanıcıdan bir char alıp
        // ascii table'dan kullanıcının girdiği char'ın sonrasındaki
        // 3 karakteri bulun
        // örnek : input : a , output: b, c, d

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir karakter giriniz : ");

        char girilenKarakter = scan.next().charAt(0);

        System.out.println((char)(girilenKarakter + 1) + ", " +
                           (char)(girilenKarakter + 2) + ", " +
                           (char)(girilenKarakter + 3)
                );


    }
}
