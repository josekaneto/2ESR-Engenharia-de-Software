import java.util.Scanner;

public class ex05 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em °C: ");
        var c = sc.nextDouble();

        var f = (c * 1.8) + 32;

        System.out.printf("A Temperatura %.2f°C em Fahrenheit eh %.2f°F", c, f);

        sc.close();
    }
}
