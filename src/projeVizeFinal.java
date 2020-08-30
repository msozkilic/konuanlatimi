import java.util.Scanner;

public class projeVizeFinal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Vize notu : ");
        int sonuc = sc.nextInt();

        System.out.print("Final notu : ");
        int son= sc.nextInt();

        double ortalama = sonuc*0.40 + son*0.60 ;
        System.out.print("Vize Final ortalamaniz :" + ortalama + "dir");



        if (ortalama >=50){
            System.out.print
                    ("tebrikler");

        }else {
            System.out.println("kaldiniz");
        }


















    }
}
