import java.util.Scanner;

public class ex06 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cotacao do dolar hoje: ");
        var d = sc.nextDouble();

        System.out.print("Digite a quantos do dolares voce possui: ");
        var q = sc.nextDouble();

        var r = d * q;
        System.out.printf("Voce possui R$%.2f", r);

        sc.close();
    }
}
