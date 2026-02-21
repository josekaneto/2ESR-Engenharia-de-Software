import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double b, a, area;

        System.out.print("Digite o valor da base do triangulo: ");
        b = sc.nextDouble();

        System.out.print("Digite o valor da altura do triangulo: ");
        a = sc.nextDouble();

        area = (b * a) / 2;

        System.out.printf("A area do triangulo eh: %.1f ", area);

        sc.close();
    }
}
