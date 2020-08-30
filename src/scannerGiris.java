import java.util.Scanner;

public class scannerGiris {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir isim giriniz :");
        String mesaj= sc.nextLine();

        System.out.println("Yasinizi giriniz");
        int yas =sc.nextInt();

        System.out.println("isminiz: " + mesaj);
        System.out.println("yasiniz" + yas);











    }
}
