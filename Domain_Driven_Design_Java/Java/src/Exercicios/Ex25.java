package Exercicios;

public class Ex25 {
    static void main() {
        int primeiroNumero = 1;
        int segundoNumero = 1;
        int terceiroNumero = -1;
        int soma = 0;

        for(int i=1; i<=20; i++){
            soma = primeiroNumero + segundoNumero + terceiroNumero;
            System.out.println(soma);
            primeiroNumero = segundoNumero;
            segundoNumero = terceiroNumero;
            terceiroNumero = soma;
        }
    }
}
