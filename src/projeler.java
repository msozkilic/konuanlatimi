import java.util.Scanner;

public class projeler {
    public static void main(String[] args) {

        System.out.println("Techno Spor Salonuna Hosgeldiniz");

        Scanner sc=new Scanner(System.in);
        System.out.print("Isim soyisim : ");
        String kod=sc.nextLine();

        System.out.print("Yasiniz : ");
        int yas= sc.nextInt();

        System.out.print("Kilonuz : ");
        double kilo= sc.nextDouble();

        System.out.print("boyunuz : ");
        double boy= sc.nextDouble();

        System.out.println("Kac aylik abonelik dusunuyorsunuz: ");
        int abonelik = sc.nextInt();

        int aylik =20;
        int toplam = abonelik *aylik;
        System.out.println(abonelik + "aylik ucretiniz " + toplam + "euro");












    }
}
