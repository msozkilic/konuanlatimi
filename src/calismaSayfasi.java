import java.util.Scanner;

public class calismaSayfasi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Vize Notu :");
        int vize=sc.nextInt();

        System.out.println("Final Notu :");
        int fin=sc.nextInt();

        double ort=vize*0.40 + fin*0.60;
        System.out.println("ortlamaniz :"+ ort+"dir");

        if(ort>=50){
            System.out.println("Gectiniz");
        }
        else {
            System.out.println("kaldiniz");
        }
        }
    }


