package Exercicios;

public class Ex24 {
    static void main() {

        int fibPrimeiro = 1, fibSegundo = 0, soma = 0;

        int a,b,f;



        for(int i=1; i<=30; i++) {
            soma = fibPrimeiro + fibSegundo;
            System.out.println(soma);
            fibPrimeiro = fibSegundo;
            fibSegundo = soma;
        }
    }
}
