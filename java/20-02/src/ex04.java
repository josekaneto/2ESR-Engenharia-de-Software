import java.util.Scanner;

public class ex04 {
    static void main() {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o primeiro valor");
        var v1 = sc.nextDouble();

        System.out.print("Digite o segundo valor");
        var v2 = sc.nextDouble();

        System.out.print("Digite o terceiro valor");
        var v3 = sc.nextDouble();

        System.out.print("Digite o quarto valor");
        var v4 = sc.nextDouble();

        var m = (v1 + v2 + v3 + v4) / 4;

        System.out.printf("O valor da base: %f", m);

        sc.close();

    }
}
