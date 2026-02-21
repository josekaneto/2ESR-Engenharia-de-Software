import java.util.Scanner;

public class ex07 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double p1, p2, p3, p4, p5, s, d, t;

        System.out.print("Digite o preco do primeiro produto: ");
        p1 = sc.nextDouble();

        System.out.print("Digite o preco do segundo produto: ");
        p2 = sc.nextDouble();

        System.out.print("Digite o preco do terceiro produto: ");
        p3 = sc.nextDouble();

        System.out.print("Digite o preco do quarto produto: ");
        p4 = sc.nextDouble();

        System.out.print("Digite o preco do quinto produto: ");
        p5 = sc.nextDouble();

        s = p1 + p2 + p3 + p4 + p5;

        System.out.printf("O total dos seus produtos ficou em R$%.2f \n", s);

        System.out.print("Digite o valor do pagamento: ");
        d = sc.nextDouble();

        if(d >= s){
            t = d - s;
            System.out.printf("O troco da sua compra eh de R$%.2f", t);
        } else {
            System.out.println("Saldo insuficiente");
        }

        sc.close();
    }
}
