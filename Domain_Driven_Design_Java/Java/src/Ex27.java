import java.util.Scanner;

public class Ex27 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double N, soma=0, resultado;

        System.out.println("Digite a quantidade de elementos da sequência: ");
        N = sc.nextInt();

        while(N < 1 || N > 50){
            System.out.println("Escreva valores entre 1 e 49");
            System.out.println("Por favor, digite novamente um número: ");
            N = sc.nextInt();
        }

        for (int i = 1; i<=N; i++){
            resultado = ((double) i / (i+1));
            System.out.println(resultado);
            soma += resultado;
        }

        System.out.printf("A soma das divisôes é %.2f", soma);

        sc.close();
    }
}
