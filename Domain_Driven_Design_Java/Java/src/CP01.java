import java.util.Scanner;

public class CP01 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int n, num, positivos = 0, negativos = 0, maior = 0, menor = 0,soma = 0;
        double media = 0, porcPositivos = 0, porcNegativos = 0;

        System.out.print("Digite a quantidade de valores que serão dgitados: ");
        n = sc.nextInt();

        while (n < 1 || n > 19){
            System.out.print("Erro! Digite apenas numeros entre 1 e 19!");
            System.out.print("Digite a quantidade de valores que serao digitados: ");
            n = sc.nextInt();
        }

        for(int i=1;i<=n;i++){
            System.out.printf("Digite o %d° numero: ", i);
            num = sc.nextInt();

            if(num >= 0)
                positivos++;
            else
                negativos++;

            if(i == 1){
                maior = num;
                menor = num;
            }
            else if(num > maior)
                maior = num;
            else if(num < menor)
                menor = num;

            soma += num;

            media = (double) soma / n;

            porcPositivos = (double) (positivos * 100) / n;
            porcNegativos = (double) (negativos * 100) / n;
        }

        System.out.printf("O maior numero eh: %d\n", maior);
        System.out.printf("O menor numero eh: %d\n", menor);
        System.out.printf("A soma dos numeros eh: %d\n", soma);
        System.out.printf("A media dos numeros eh: %.2f\n", media);
        System.out.printf("A porcentagem de numeros positivos eh: %.2f%%\n", porcPositivos);
        System.out.printf("A porcentagem de numeros negativos eh: %.2f%%", porcNegativos);
        sc.close();
    }
}
