import java.util.Scanner;

public class ex01 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b, a, area;

        System.out.print("Digite a base do retangulo: ");
        b = sc.nextInt();

        System.out.print("Digitea a altura do retangulo: ");
        a = sc.nextInt();

        area = b * a;

       System.out.println(area);
       System.out.println("Area do retangulo: " + area);
       System.out.printf("Area do retangulo: %d", area);

       System.out.printf("Area do retangulo: %d, pois eh o produto da base %d e da altura %d", area, b, a);

       sc.close();
    }
}
