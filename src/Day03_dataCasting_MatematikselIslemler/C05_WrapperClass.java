package Day03_dataCasting_MatematikselIslemler;
public class C05_WrapperClass {
    public static void main(String[] args) {
        int sayi = 10;
        String str = "Java Candır";
        /*
        int primitive olduğundan hazır method'ları yoktur
        String non-primitive olduğu için hazır method'ları vardır.

        int, char, boolean gibi primitive variable türlerinde hazır method kullanmak için
        Java Integer, Character, Boolean gibi wrapper class'lar oluşturmuştur.

        bunlar primitive'ler ile aynı değerleri alabilir ama ekstradan method'ları da varıdr.
        */

        Integer sayi2 = 20;

        /*
        işlemlerimizi yaparken bazen String olarak tanımlanmış
        ancak matematiksel içerik barındıran variable'lar ile karşılaşabiliriz.
        Bu durumda bu tür String variable'ları sayıya çevirmek ihtiyacımız olabilir.

        Eğer sayıya çevirmek istediğimiz metinlerde
        harf veya sayı olmayan başka karakter varsa
        Java hata verir.
         */
        String str2 = "123";
        String str3 = "354";

        System.out.println(str2 + str3); //123354 Toplama işlemi yerien yanyana yazacaktır.

        int str2int = Integer.parseInt(str2);
        int str3int = Integer.parseInt(str3);

        System.out.println(str2int + str3int); // 477 Wrapper'dan gelen değerleri matematiksel işlemi yapar

        System.out.println(Integer.MAX_VALUE); //  2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483647

        System.out.println("Bir karakter giriniz : ");

        // char krk1 = '$';
        char krk1 = '$';

        System.out.println(Character.isDigit(krk1)); // false
        System.out.println(Character.isLetter(krk1)); // false
        System.out.println(Character.isAlphabetic(krk1)); // false
        System.out.println(Character.isLetterOrDigit(krk1)); // true


    }
}
