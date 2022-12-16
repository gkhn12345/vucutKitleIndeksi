import java.util.Scanner;
public class vucutKıtle {
    public static void main(String[] args) {

        //Değerleri giriyoruz.

        double kilo , boy,vucutKitleIndeksi;

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan veri alıyoruz.

        System.out.print("Kilonuzu Giriniz : ");

        kilo= input.nextDouble();

        System.out.print("Boyunuzu Giriniz : ") ;

        boy=input.nextDouble();

        vucutKitleIndeksi= kilo / boy * boy ;

        System.out.print("Vücut Kitle İndeksiniz : " + vucutKitleIndeksi );






    }
}
