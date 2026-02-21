import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lado, area;

        System.out.print("Digite o valor do lado: ");
        lado = sc.nextInt();

        area = lado * lado;

        System.out.printf("A area do quadrado eh: %d, pois o valor do lado eh %d", area, lado);

        sc.close();
    }
}
