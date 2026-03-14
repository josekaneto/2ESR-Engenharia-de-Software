import java.util.Scanner;

public class Ex28 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double  v, soma = 0, maiorValor = 0, media = 0, menorValor = 0;



        for (int i = 1; i <=10; i++){
            System.out.printf("Digite o %d° numero: ", i);
            v = sc.nextDouble();

            while (v <= 0){
                System.out.println("Tem que ser um numero positivo");
                System.out.printf("Digite novamente o valor %d: ", i);
                v = sc.nextDouble();
            }

            soma += v;

            // Maior valor
            if(v > maiorValor){
                maiorValor = v;
            }

            // Menor valor
            if(i == 1){
                menorValor = v;
            }

            if(v < menorValor){
                menorValor = v;
            }
            
            media = soma / 10;
        }

        System.out.println("O maior valor é: " + maiorValor);
        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println("A media dos números digitados é: " + media);
        System.out.println("O Menor valor é: " + menorValor);

    }
}
