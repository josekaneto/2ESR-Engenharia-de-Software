package Exercicios;

import java.util.Scanner;

public class Ex26 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double N,  soma = 0, somaTotal=0;

        System.out.print("Digite um numero: ");
        N = sc.nextInt();

        while (N < 0 || N > 100){
            System.out.println("Escreva valores entr 1 e 99");
            System.out.println("Por favor, digite novamente um número: ");
            N = sc.nextInt();
        }

        for(int i = 1; i<=N; i++){
            soma = (Math.pow(i,2)) + 1;
            System.out.println(soma);
            somaTotal += soma;
        }

        System.out.println("A soma dos elementos é: "+ somaTotal);
        
        sc.close();
    }
}
