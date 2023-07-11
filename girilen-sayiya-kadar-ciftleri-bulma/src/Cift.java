import java.util.Scanner;

public class Cift {

    public static void main(String[] args) {


        //kullanıcının girdiği değere kadar ekrana çift sayıları yazdıran program

        Scanner inp = new Scanner(System.in);

        int k;

        System.out.print("Sayıyı giriniz: ");
        k = inp.nextInt();

        for (int i = 1; i <= k; i++) {      //kullanıcının girdiği değere kadar ekrana yazdırma

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


        // Ödev
        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ort. hesaplayan program


        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.print("Değer giriniz: ");
        a = input.nextInt();

        int adet = 0;
        int toplam = 0;
        int ortalama;


        for (b = 0; b <= a; b++) {

            if (b % 3 == 0 && b % 4 == 0) {
                System.out.println(b);
                adet++;
                toplam += b;
            }
        }
        System.out.println(adet + " tane bölünen var");
        System.out.println("Toplam: " + toplam);
        System.out.println("Ortalama: " + toplam / adet);


    }
}
