import java.util.Scanner;
public class Ucgen_Alan_Java {
    public static void main(String[] args) {
        // kullanıcı verileri alma
        double a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Üçgenin kenarlarını giriniz");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        // alan hesaplama
        double u = (a+b+c)/2;
        double Alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı: " + Alan);
    }

}
